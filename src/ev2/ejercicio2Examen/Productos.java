package ejercicio2;

public class Productos {
    private int idProducto=99;
    private String nombreProducto="Chorizo";
    private String ubicacion="Nevera";
    private double precioProducto=2;

    //Constructores
    public Productos() {
    }
    public Productos(int idProducto, String nombreProducto, String ubicacion, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.ubicacion = ubicacion;
        this.precioProducto = precioProducto;
    }

    //Getters & Setters
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
}
