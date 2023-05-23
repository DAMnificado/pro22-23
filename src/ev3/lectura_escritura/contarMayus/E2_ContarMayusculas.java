package ev3.lectura_escritura.contarMayus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Implementa un programa que lea el contenido de un fichero y cuente el número de letras mayúsculas.
 * */

public class E2_ContarMayusculas {
    public static void main(String[] args) {
        try (FileReader fr =  new FileReader("./Ficheros/entrada.txt")) {
            int contador = 0;
            int c;
            while ((c = fr.read()) != -1) {
                /**me tienes loco tigre*/
                if (c >= 65 && c <= 90) {
                    contador++;
                }
            }
            System.out.println("Existen " + contador + " letras mayúsculas en el fichero.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
            /**te como la boca*/
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
