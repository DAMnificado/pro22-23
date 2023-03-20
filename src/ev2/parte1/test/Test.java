package ev2.parte1.test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    int num1, num2;

    public void leeNumeros() {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.print("Introduzca el primer número:");
            String text = br.readLine();
            num1 = Integer.parseInt(text);

            System.out.print("Introduzca el segundo número:");
            text = br.readLine();
            num2 = Integer.parseInt(text);

        } catch (IOException e) {
            System.err.println("Se ha producido una IOException");
            e.printStackTrace();
        } catch (Throwable e) {
            System.err.println("Error de programa: " + e);
            e.printStackTrace();
        }
    }

    public void muestraNumeros() {
        try {
            System.out.println(num1 + num2);
            System.out.println(num1 * num2);
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        }

        catch (ArithmeticException e) {
            System.out.println("División por cero");
        }

        catch (Exception e) {
            System.out.println("Se produjo un error en el programa");
        }
    }

}


