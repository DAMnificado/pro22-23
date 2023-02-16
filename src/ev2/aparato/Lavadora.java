package ev2.aparato;

/**
 * implementar una subclase Lavadora con las siguientes características:
 *
 * Sus atributos son kilos y secadora integrada (booleano). Por defecto, la capacidad será de 7 kilos y secadora será false.
 * * Un constructor por defecto.
 * * Un constructor con el precio y peso. El resto por defecto.
 * * Un constructor con la capacidad, secadora y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 * * Getters y Setters
 * * aplicarDescuento(): si tiene una capacidad superior a 9 kilos, se incrementará el precio un 30% y si no tiene secadora integrada, se descontarán 120 €.

 * Ahora crea una clase ejecutable que realice lo siguiente:

 * Crea un array de Electrodomesticos de 5 posiciones.
 * Ejecutar el método aplicarDescuento() para cada uno de los elementos.
 * Deberás mostrar el precio de cada tipo de aparato (instanceof)
 */
public class Lavadora extends Aparato {

    private int capacidad = 7;
    private boolean secadoraIntegrada = false;

    public Lavadora() {
        }

    public Lavadora(Integer pvp, Integer peso) {
            super(pvp, peso);
        }

    public Lavadora(Integer pvp, String color, char consumo, Integer peso,int capacidad, boolean secadoraIntegrada){
            super(pvp, color, consumo, peso);
            this.capacidad = capacidad;
            this.secadoraIntegrada = secadoraIntegrada;
        }

        public int getCapacidad () {
            return capacidad;
        }

        public void setCapacidad ( int capacidad){
            this.capacidad = capacidad;
        }

        public boolean isSecadoraIntegrada () {
            return secadoraIntegrada;
        }
        public void setSecadoraIntegrada ( boolean secadoraIntegrada){
            this.secadoraIntegrada = secadoraIntegrada;
        }
    public Integer aplicarDescuento() {
        super.aplicarDescuento();
        if (getCapacidad() > 9) {
            setPvp((int) (getPvp() * 1.3));
        }
        if (secadoraIntegrada == false) {
            setPvp(getPvp() - 120);
        }
        System.out.println("El descuento aplicado al descuento ya existente por las rebajas es de: " + getPvp());
        return getPvp();
    }
    public String toString() {
        return super.toString() + "Capacidad de la lavadora: " + capacidad + "\n" + "Tiene secadora integrada: " + secadoraIntegrada;
    }
}




