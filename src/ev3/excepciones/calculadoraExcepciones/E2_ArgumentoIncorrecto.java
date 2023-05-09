/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev3.excepciones.calculadoraExcepciones;

import java.util.InputMismatchException;

/**
 *
 * @author nccasares
 */
public class E2_ArgumentoIncorrecto extends InputMismatchException{

    public E2_ArgumentoIncorrecto() {
    }

    public E2_ArgumentoIncorrecto(String s) {
        super(s);
        System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
    
}
