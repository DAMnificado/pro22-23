package ev2.SobreRuedas;

public class Coche implements Vehiculo {

    public int veloCoche;

    public Coche(int veloCoche) {
        this.veloCoche = veloCoche;
    }

    @Override
    public int frenar(int decre) {
        int frenadoCoche = 0;
        frenadoCoche = veloCoche - decre;
        return frenadoCoche;
    }

    @Override
    public String acelerar(int incre) {
        int aceleradoCoche=0;
        aceleradoCoche=veloCoche + incre;
        return "La velocidad  es: " + aceleradoCoche;
    }
}

