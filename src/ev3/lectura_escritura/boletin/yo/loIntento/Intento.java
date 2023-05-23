package ev3.lectura_escritura.boletin.yo.loIntento;

import java.io.*;

/**
 * A partir de un array con nombres de persona, escribir en un fichero denominado “datos.txt”
 * dichos nombres, cada uno en una línea.
 * A continuación, leer los datos de nuevo del fichero y
 * mostrarlos por pantalla, indicando el índice de la posición que ocupa.
 * Ejemplo de ejecución:
 * 1. Juan
 * 2. María
 * 3. Paco
 * */

public class Intento {

    public static void leerEscribirFicheros(){

        File archivo = new File("./src/boletin/loIntento/datos.txt");
        creararchivo(archivo);
        String [] personas = {"Joao", "Cusharo", "Matuidi"};
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(archivo));
            int cont=1;
            for (int i = 0;i< personas.length;i++){
            dos.writeUTF(cont+personas[i]+"\n");
                System.out.println(cont+personas[i]);
            cont++;

            }
        } catch (FileNotFoundException e) {
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

