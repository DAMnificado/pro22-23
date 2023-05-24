package ev3.lectura_escritura.boletin.yo.loIntentoFresas;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

/**
 * Pedir al usuario cuatro pares de palabras que rimen
 *
 * GUARDAR (añadir) en un archivo de texto
 * LISTAR el contenido del archivo
 *
 * Implementar un metodo que BUSCAR la linea en la que esta la palabra que da el usuario
 * que diga que "la palabra no se encuentra en el archivo" si no aparece
 *
 * Implementar un metodo que BORRE la palabra que da el usuario y la de su pareja
 */
public class Rapp {

    static File archivo = new File("C:\\Users\\elmen\\Desktop\\DAM\\pro22-23\\src\\ev3\\lectura_escritura\\boletin\\yo\\loIntentoFresas\\datos.txt");
    static File archivoAux = new File("C:\\Users\\elmen\\Desktop\\DAM\\pro22-23\\src\\ev3\\lectura_escritura\\boletin\\yo\\loIntentoFresas\\temporal.txt");
    static String[] rimas = new String[2];
    static String[] parejas = new String[2];


    public static void addRegistro() {
        creararchivoE(archivo);
        String rima = "";
        String pareja = "";

        for (int i = 0; i < rimas.length; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Dime una palabra");
            rima = sc.nextLine();

            System.out.println("Dime otra que rime con la anterior");
            pareja = sc.nextLine();

            try {
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo,true));
                dos.writeUTF(rima + " " + pareja + "\n");
                rimas[i] = rima;
                parejas[i] = pareja;
                dos.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    public static void listarArchivo() {

        String linea = "";
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(archivo));
            while (true) {
                  linea = dis.readUTF();
                  System.out.println(linea);
            }
        } catch (EOFException e) {
            System.out.println("Archivo acabado");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void buscar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra que quieras buscar");
        String palabraABuscar =sc.nextLine();
        boolean encontrado = false;
        try {
            DataInputStream disA = new DataInputStream(new FileInputStream(archivo));
            String linea="";

            while(true) {
                linea = disA.readUTF();
                if (linea.split(" ")[0].equalsIgnoreCase(palabraABuscar)) {
                    encontrado = true;
                }
            }

        }catch (EOFException e){
            if (encontrado==true){
                System.out.println("SI!! Hemos encontrado la palabra");
            } else System.out.println("No... no se ha encontrado la palabra");
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void borrar() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra que quieras borrar");
        String palabraABuscar =sc.nextLine();

        try {
            DataInputStream disA = new DataInputStream(new FileInputStream(archivo));
            DataOutputStream dosAux = new DataOutputStream(new FileOutputStream(archivoAux));
            String linea="";

            while(true) {
                linea = disA.readUTF();
                if (linea.split(" ")[0].equalsIgnoreCase(palabraABuscar)) {
                    System.out.println("Eliminado" + linea);

                } else dosAux.writeUTF(linea);
            }

        } catch (EOFException e) {
            System.err.println("Fin de fichero");
            Files.deleteIfExists(Paths.get(archivo.getAbsolutePath()));
            Files.move(Paths.get(archivoAux.getAbsolutePath()), Paths.get("datos.txt"));

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    private static void creararchivoE(File archivo) {
        if (!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
