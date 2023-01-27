package ev2.Aparato;

/**
 * Crear clase Aparato que contenga:
 * Atributos:
 * 	PVP
 * 	Color
 * 	Consumo (letras entre A y F)
 * 	Peso.
 * Por defecto, el color sera blanco, el consumo energético será F, el PVP 100 € y el peso 5 kg. Los posibles colores son blanco, negro, rojo, azul y gris.
 * Constructores:
 * 	Por defecto.
 * 	Uno con el precio y peso. El resto por defecto.
 * 	Uno con todos los atributos.
 * Métodos:
 * Getters y Setters.
 * comprobarConsumo(char letra): se comprueba que la letra esté entre las válidas. Si no, se asignará la letra por defecto (F). Se invocará al crear el objeto.
 * aplicarDescuento(): con la nueva normativa vigente, a los electrodomésticos con un menor impacto medioambiental, se les aplicará un descuento:
 * * A los electrodomésticos que no empleen esmalte de color (gris), se les aplicará una bonificación de un 5% en el precio de venta.
 * * Según consumo energético, se les aplicarán además los siguientes descuentos:
 *
 * LETRA	DESCUENTO
 * A		20%
 * B		15%
 * C		10%
 * D		5%
 * E		0
 * F		0
 */

public class Aparato {

    public Integer pvp=100;
    public String color="blanco";
    public char consumo='F';
    /**
     *
     * el numero en la tabla ASCI o la letra entre comillas simples
     */
    public Integer peso=5;

    public Aparato() {
        this.pvp = pvp;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Aparato(Integer pvp, Integer peso) {
        this.pvp = pvp;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Aparato(Integer pvp, String color, char consumo, Integer peso) {

        switch (color){
            case"Blanco", "Negro", "Gris", "Azul", "Rojo" -> this.color=color;
            default -> {
                System.out.print("Se ha introducido un color no contemplado");
                System.out.println("Se ha asignado un color por defecto: Blanco. \n");
                this.color="Blanco";
            }
        }
        this.pvp=pvp;
        this.consumo = comprobarConsumo(consumo);
        this.peso = peso;
    }

    public Integer getPvp() {
        return pvp;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public char comprobarConsumo(char letra) {
        /**
        switch (consumo){
            case'A':
            case'B':
            case'C':
            case'D':
            case'E': this.consumo=consumo;
                break;
            default:this.consumo='F';
                System.out.println("Ese consumo no está en nuestro catálogo, hemos asignado el consumo por defecto: " + consumo);
        }*/
        if (letra < 65 || letra > 70){
            System.out.println("Se ha introducido un valor no contemplado");
            System.out.println("Se ha asignado un valor por defecto: 'F' .\n");
            return 'F';
        } return letra;


    }

    @Override
    public String toString() {
        return "Aparato{" +
                "pvp=" + pvp +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
