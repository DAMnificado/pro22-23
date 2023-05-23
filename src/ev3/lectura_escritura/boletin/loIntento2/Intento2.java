package boletin.loIntento2;

import java.io.*;

/**
 * Desarrolla un programa que lea datos de 2 arrays, uno con nombres de productos y el otro
 * con sus precios. Almacenar dicho contenido en un fichero, donde cada línea constará de
 * nombre de producto y precio.
 */
public class Intento2 {
    static String [] productos = {"Chori","Leche","Pan"};
    static float [] precios = {3.0F,4.0F,5.0F};
    static File archivo = new File("./src/boletin/loIntento2/datos.txt");

    public static void escribirArchivo(){
        creararchivo(archivo);
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo));
            for(int i =0;i<productos.length;i++) {
                dos.writeUTF(productos[i] + precios[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void leerArchivo(){

       try(DataInputStream dis = new DataInputStream(new FileInputStream(archivo))) {
           while (true){
               System.out.println(dis.readUTF());

           }
       }     catch (EOFException e) {
           System.out.println("Fin del archivo");
       }

       catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }


    }

    private static void creararchivo(File archivo) {
        if (!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
