package ejercicio3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        menu();

    }

    private static void menu() {
        Scanner sc= new Scanner(System.in);
        int op;
        do {
            System.out.println("0- salir");
            System.out.println("1- Añadir libros al fichero");
            System.out.println("2- consultar libro por titulo");
            System.out.println("3- listar libros");
            System.out.println("4- Eliminar libro por titulo");
            try {
                op = sc.nextInt();
            }catch (InputMismatchException e){
                System.err.println("ERROR: opcion no valida");
                op=-1;
            }
            switch (op){
                case 1:
                    anhadirLibro();
                    break;
                case 2:
                    consultarLibro();
                    break;
                case 3:
                    listarLibros();
                    break;
                case 4:
                    eliminarLibro();
                    break;
            }
        }while (op!=0);
    }

    private static void eliminarLibro() {
        Scanner sc= new Scanner(System.in);
        File temp=null;
        try {
          temp = File.createTempFile("temp","txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("introduzca titulo a eliminar");
        String tituloBuscado = sc.nextLine();
        try(ObjectInputStream dis=new ObjectInputStream(new FileInputStream("listalibros.txt"));
        ObjectOutputStream ois=new ObjectOutputStream(new FileOutputStream(temp))){
            Libro libro;
            while(true){
                libro=(Libro) dis.readObject();
                if(!libro.getTitulo().equals(tituloBuscado)) {
                    ois.writeObject(libro);
                } else System.out.println("Se elimina el libro: "+libro);
            }
        }catch (EOFException e){

            System.err.println("Fin del fichero");

            File f=new File("listalibros.txt");

            temp.renameTo(f);

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        File f=new File("listalibros.txt");
        temp.renameTo(f);
    }

    private static void listarLibros() {
        try(ObjectInputStream dis=new ObjectInputStream(new FileInputStream("listalibros.txt"))){
            Libro libro;
            while(true){
                libro=(Libro) dis.readObject();
                System.out.println(libro);
            }
        } catch (EOFException e){
            System.err.println("Fin del fichero");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void consultarLibro() {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduzca titulo a buscar");
        String tituloBuscado = sc.nextLine();
        try(ObjectInputStream dis=new ObjectInputStream(new FileInputStream("listalibros.txt"))){
            Libro libro;
            while(true){
                libro=(Libro) dis.readObject();
                if(libro.getTitulo().equals(tituloBuscado)) System.out.println(libro);
            }
        } catch (EOFException e){
            System.err.println("Fin del fichero");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void anhadirLibro() {
        String titulo,autor,editorial;
        int numpaginas=0;
        boolean datoValido=true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduzca titulo");
             titulo = sc.nextLine();
            System.out.println("introduzca autor");
             autor = sc.nextLine();
            System.out.println("introduzca editorial");
             editorial = sc.nextLine();
            System.out.println("introduzca numero de paginas");
            try {
                 numpaginas = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("ERROR: opcion no valida");
                datoValido = false;
            }
        }while(!datoValido);
        Libro libro=new Libro(titulo,autor,editorial,numpaginas);
        guardar(libro);
    }

    private static void guardar(Libro libro) {
        //he intentado corregir el problema de crear varios objetos en distintas instancias pero me da fallo de cabecera
        File f=new File("listalibros.txt");
        if(f.exists()){
            try (MiObjectOutputStream ois = new MiObjectOutputStream(new FileOutputStream("listalibros.txt",true))) {
                ois.writeObject(libro);
            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("listalibros.txt"))) {
                ois.writeObject(libro);
            }  catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
