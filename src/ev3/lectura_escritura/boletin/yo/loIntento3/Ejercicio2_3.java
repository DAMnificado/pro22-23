package ev3.lectura_escritura.boletin.yo.loIntento3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio2_3 {
    static File archivo = new File("./src/boletin/loIntento3/datos.txt");
    static File archivoAux = new File("./src/boletin/loIntento3/temporal.txt");

    public void cargarFichero() {

        try (DataOutputStream dosA = new DataOutputStream(new FileOutputStream(archivo))){

            String[] productos = {"Agua", "Leche", "Jabón", "Yogur"};
            double[] precios = {0.75, 0.95, 2.15, 1.50};

            for (int i = 0; i < productos.length; i++) {
                dosA.writeUTF(productos[i] + " " + precios[i] + "\n");
            }
            System.out.println("Fichero cargado");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void borrado () throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto que desea eliminar:");
        String nombre = sc.nextLine();

        try(DataInputStream disA = new DataInputStream(new FileInputStream(archivo))) {
            DataOutputStream dosAux = new DataOutputStream(new FileOutputStream(archivoAux));

            String linea;

            while (true) {
                linea = disA.readUTF();

                if (linea.split(" ")[0].equalsIgnoreCase(nombre))
                    System.out.println("Eliminado" + linea);
                else
                    dosAux.writeUTF(linea);
            }
        } catch (EOFException e) {
            System.err.println("Fin de fichero");
            archivo.delete();
            Files.move(Paths.get(archivoAux.getAbsolutePath()), Paths.get("datos.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Ejercicio2_3 e = new Ejercicio2_3();
        try {
            e.cargarFichero();
            e.borrado();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
