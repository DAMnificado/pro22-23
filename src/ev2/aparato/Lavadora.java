package ev2.aparato;

/**
 *
 * implementar una subclase Lavadora con las siguientes características:
 *
 * Sus atributos son kilos y secadora integrada (booleano). Por defecto, la capacidad será de 7 kilos y secadora será false.
 * * Un constructor por defecto.
 * * Un constructor con el precio y peso. El resto por defecto.
 * * Un constructor con la capacidad, secadora y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 * * Getters y Setters
 * * aplicarDescuento(): si tiene una capacidad superior a 9 kilos, se incrementará el precio un 30% y si no tiene secadora integrada, se descontarán 120 €.
 *
*/

public class Lavadora extends Aparato {

    private boolean secadoraIntegrada;
    private int kilos;

    public Lavadora() {
        this.secadoraIntegrada=false;
                this.kilos=7;
    }

    public Lavadora(int PVP, int peso, boolean secadoraIntegrada, int kilos) {
        super(PVP, peso);
        this.secadoraIntegrada = false;
        this.kilos = 7;
    }

    public Lavadora(int PVP, String color, char consumo, int peso, boolean secadoraIntegrada, int kilos) {
        super(PVP, color, consumo, peso);
        this.secadoraIntegrada = secadoraIntegrada;
        this.kilos = kilos;
    }

    public boolean isSecadoraIntegrada() {
        return secadoraIntegrada;
    }

    public void setSecadoraIntegrada(boolean secadoraIntegrada) {
        this.secadoraIntegrada = secadoraIntegrada;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    @Override
    public void aplicarDescuento() {
        super.aplicarDescuento();
        if(kilos>7){
            setPVP((int) (getPVP()*1.3));
        }
        if (secadoraIntegrada=false){
            setPVP(getPVP()-120);
        }
    }
}
