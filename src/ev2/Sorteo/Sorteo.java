package ev2.Sorteo;

public abstract class Sorteo {
    protected int posibilidades;

    public Sorteo() {
    }

    public Sorteo(int posibilidades) {
        this.posibilidades = posibilidades;
    }

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }
    public abstract int lanzar();
}


