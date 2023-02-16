package ev2.aparato;

/**
 * Crear una subclase llamada Frigorifico:
 *
 * Tendrá como atributos propios capacidad (por defecto 300 litros) y altura (por defecto 170 cm).
 * Constructores:
 * Un constructor por defecto.
 * Un constructor con el precio y peso.
 * Un constructor con la capacidad, la altura y el resto de atributos heredados.
 *
 * Métodos:
 * getters y setters.
 * aplicarDescuento(): A mayores de las bonificaciones aplicadas en Aparato según su color y eficiencia,
 * si el Frigorifico tiene un consumo energético A o B y una capacidad superior a 400 litros, se aplicará otro descuento del 10% sobre el precio de venta.
 *
 */

public class Frigo extends Aparato {

    private int capacid = 300;
    private int altura = 170;

    public Frigo() {
    }

    public Frigo(Integer pvp, Integer peso) {
        super(pvp, peso);
    }

    public Frigo(Integer pvp, String color, char consumo, Integer peso, int altura) {
        super(pvp, color, consumo, peso);
        this.altura = altura;
    }
    public Integer aplicarDescuento() {
        super.aplicarDescuento();
        if (capacid > 400 && getConsumo() == 'A' || getConsumo() == 'B')
            setPvp((int) (getPvp() * 1.1));
        System.out.println("El descuento aplicado al descuento ya existente por las rebajas es de: " + getPvp());
        return getPvp();
    }
    public String toString() {
        return super.toString() + "Capacidad de la nevera: " + capacid + "\n" + "Altura: " + altura;
    }

}
