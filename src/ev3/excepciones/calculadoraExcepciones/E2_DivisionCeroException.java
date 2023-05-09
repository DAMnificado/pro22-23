/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev3.excepciones.calculadoraExcepciones;


/**
 *
 * @author nccasares
 */
public class E2_DivisionCeroException extends ArithmeticException{

    public E2_DivisionCeroException() {
    }

    public E2_DivisionCeroException(String s) {
        super(s);
        System.out.println("***SE HA PRODUCIDO UN ERROR AL INTENTAR DIVIDIR POR 0");
    }
    
}
