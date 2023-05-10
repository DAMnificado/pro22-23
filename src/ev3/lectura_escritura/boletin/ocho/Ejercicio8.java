package ev3.lectura_escritura.boletin.ocho;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que vaya solicitando al usuario cadenas de texto y las vaya introduciendo en un fichero.
 * Se debe tener en cuenta que no se admitirán en el fichero las letras "N", "Y", y "U",
 * por lo que deberán ser eliminadas previamente.
 * */

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("datosEj8.txt")){
            String lectura;
            do {
                System.out.println("Introduzca cadena para almacenar en el fichero:");
                lectura = teclado.nextLine();
                if (!lectura.equals("*")) {
                    lectura = lectura.replaceAll("N", "");
                    lectura = lectura.replaceAll("Y", "");
                    lectura = lectura.replaceAll("U", "");
                    fw.write(lectura + "\n");
                }
            } while (!lectura.equals("*"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
