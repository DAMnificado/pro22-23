package ev3.lectura_escritura.boletin.yo.loIntento3;

import java.io.*;

/**
 * A partir del ejercicio anterior, implementa un método que solicite un nombre de producto al
 * usuario y lo elimine del listado (del fichero).
 *
 * Deberá mostrar también su información por
 * pantalla (nombre y precio)
 */
public class Intento3 {
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

    public static void solicitaProducto(){

    }
    /**
     * A partir del ejercicio anterior, implementa un método que solicite un nombre de producto al
     * usuario y lo elimine del listado (del fichero).
     *
     * Deberá mostrar también su información por
     * pantalla (nombre y precio)
     */
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

