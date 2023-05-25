package ejercicio2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        String[] provincias={"Pontevedra","Lugo","A coruña","Ourense"};
        guardarDatos(provincias);
    listar();
    }

    private static void listar() {
        try(DataInputStream dis=new DataInputStream(new FileInputStream("ProvinciasCodigo.txt"))){
            String linea;
            while(true){
                linea=dis.readUTF();
                System.out.println( linea);
            }
        } catch(EOFException e){
            System.err.println("Fin del archivo");
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void guardarDatos(String[] provincias) {
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("ProvinciasCodigo.txt"))){
            Scanner sc= new Scanner(System.in);
            for(int i=0;i< provincias.length;i++) {
                int op=0;
                do {
                    System.out.println("Indique codigo postal para " + provincias[i]);
                    String codigoPostal=null;
                    try {
                        op=0;
                         codigoPostal = sc.nextLine();
                        if (Integer.parseInt(codigoPostal) < 0) throw new NegativosException();
                        if (Integer.parseInt(codigoPostal.substring(0, 2)) > 52 | Integer.parseInt(codigoPostal.substring(0, 2)) < 1)
                            throw new CodigoIncorrectoException();
                        if (codigoPostal.length() != 5)
                            throw new LonguitudException();
                        dos.writeUTF(provincias[i] + " " + codigoPostal+"\n");
                    } catch (NegativosException e) {
                        System.err.println("Error: el codigo no puede ser negativo");
                        op++;
                    } catch(CodigoIncorrectoException e){
                        System.err.println("Error: el codigo no valido");
                        op++;
                    } catch (LonguitudException e){
                        System.err.println("Error: el codigo debe tener una longuitud de 5 caracteres");
                        op++;
                    }

                }while(op!=0);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static class NegativosException  extends ArithmeticException{
        public NegativosException() {
            super();

        }
    }

    private static class CodigoIncorrectoException extends InputMismatchException {

        public CodigoIncorrectoException() {
            super();
        }
    }
}
