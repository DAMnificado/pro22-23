package ejercicio2;

public class Refrescos extends Bebidas{
    private int porcentajeAzucar=99;

    //Constructores
    public Refrescos() {
    }
    public Refrescos(int idProducto, String nombreProducto, String ubicacion, int precioProducto, String envasado, int porcentajeAzucar) {
        super(idProducto, nombreProducto, ubicacion, precioProducto, envasado);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    //Getters & Setters
    public int getPorcentajeAzucar() {
        return porcentajeAzucar;
    }
    public void setPorcentajeAzucar(int porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    //Método calcularPrecio de REFRESCOS
    @Override
    public void calcularPrecio() {
        if (getEnvasado()=="lata"){
            setPrecioProducto((double) (getPrecioProducto()*0.95));
        }
        if (getPorcentajeAzucar()>10){
            setPrecioProducto((double) (getPrecioProducto()*1.1));
        }
    }
}
