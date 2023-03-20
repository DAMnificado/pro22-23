package ev2.parte1.aparato;

/**
 *  *  *  * Crear clase Aparato que contenga:
 *  *  *  * Atributos:
 *  *  *  * 	PVP
 *  *  *  * 	Color
 *  *  *  * 	Consumo (letras entre A y F)
 *  *  *  * 	Peso.
 *  *  *  * Por defecto, el color sera blanco, el consumo energético será F, el PVP 100 € y el peso 5 kg. Los posibles colores son blanco, negro, rojo, azul y gris.
 *  *  *  * Constructores:
 *  *  *  * 	Por defecto.
 *  *  *  * 	Uno con el precio y peso. El resto por defecto.
 *  *  *  * 	Uno con todos los atributos.
 *  *  *  * Métodos:
 *  *  *  * Getters y Setters.
 *
 *
 *
 *
 *  *  *  * comprobarConsumo(char letra): se comprueba que la letra esté entre las válidas. Si no, se asignará la letra por defecto (F). Se invocará al crear el objeto.
 *
 *
 *
 *  *  *  * aplicarDescuento(): con la nueva normativa vigente, a los electrodomésticos con un menor impacto medioambiental, se les aplicará un descuento:
 *  *  *  * * A los electrodomésticos que no empleen esmalte de color (gris), se les aplicará una bonificación de un 5% en el precio de venta.
 *  *  *  * * Según consumo energético, se les aplicarán además los siguientes descuentos:
 *  *  *  *
 *  *  *  * LETRA	DESCUENTO
 *  *  *  * A		20%
 *  *  *  * B		15%
 *  *  *  * C		10%
 *  *  *  * D		5%
 *  *  *  * E		0
 *  *  *  * F		0
 *  */

public class Aparato {

    private int PVP;
    private String color;
    private char consumo;
    private int peso;

//Constructores

    public Aparato() {
        this.color = "blanco";
        this.peso = 5;
        this.consumo = 'F';
        this.PVP = 100;
    }

    public Aparato(int PVP, int peso) {
        this.PVP = PVP;
        this.peso = peso;
        this.consumo = 'F';
        this.color = "blanco";
    }

    public Aparato(int PVP, String color, char consumo, int peso) {
        this.PVP = PVP;
        this.color = color;
        if (comprobarConsumo(consumo))this.consumo = consumo;
        this.peso = peso;
    }

//Getters Y Setters

    public int getPVP() {
        return PVP;
    }

    public void setPVP(int PVP) {
        this.PVP = PVP;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private boolean comprobarConsumo(char consumo){
        return (consumo>= 65 && consumo<=70);
        }

    public void aplicarDescuento () {
        if (!color.equals("gris")) {
            PVP *= 0.95;
        }
        switch (consumo) {

            case 'A':
                PVP *= 0.8;
                break;
            case 'B':
                PVP *= 0.85;
                break;
            case 'C':
                PVP *=  0.90;
                break;
            case 'D':
                PVP *= 0.95;
                break;
        }
    }
}