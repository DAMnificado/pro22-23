package ev2.aparato;

public class Lavadora extends Aparato{

    private int kilos=7;
    private boolean secadoraIntegrada=false;

    public Lavadora() {

    }
    public Lavadora(Integer pvp, Integer peso) {
        super(pvp, peso);
    }

    public Lavadora(Integer pvp, String color, char consumo, Integer peso, int kilos, boolean secadoraIntegrada) {
        super(pvp, color, consumo, peso);
        this.kilos = kilos;
        this.secadoraIntegrada = secadoraIntegrada;
    }

}

