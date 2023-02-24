package ejercicio2;

public abstract class Bebidas extends Productos{
    private String envasado="cartón";

    //Constructores
    public Bebidas() {
    }
    public Bebidas(int idProducto, String nombreProducto, String ubicacion, int precioProducto, String envasado) {
        super(idProducto, nombreProducto, ubicacion, precioProducto);
        this.envasado = envasado;
    }

    //Getters & Setters

    public String getEnvasado() {
        return envasado;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public abstract void calcularPrecio();
}
