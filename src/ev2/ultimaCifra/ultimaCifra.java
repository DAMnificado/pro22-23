package ev2.ultimaCifra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ultimaCifra {

    int num1;

    public void leerNumero() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.print("Introduzca el numero:");
            String text = br.readLine();
            num1 = Integer.parseInt(text);

        } catch (IOException e) {
            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        } catch (Throwable e) {
            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }

    }
}