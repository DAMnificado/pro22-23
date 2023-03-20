package ev2.parte1.aparato;


/**
 * Crear una subclase llamada Frigorifico:
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
 */
public class Frigorifico extends Aparato{

    private int capacidad;
    private int altura;


    public Frigorifico() {
        this.capacidad=300;
        this.altura=170;
    }

    public Frigorifico(int PVP, int peso) {
        super(PVP, peso);
    }

    public Frigorifico(int PVP, String color, char consumo, int peso, int capacidad, int altura) {
        super(PVP, color, consumo, peso);
        this.capacidad = capacidad;
        this.altura = altura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void aplicarDescuento() {
        super.aplicarDescuento();
        if ((getConsumo()=='A'||getConsumo()=='B') && capacidad>400){
            setPVP((int) (getPVP()*0.1));
        }
    }
}
