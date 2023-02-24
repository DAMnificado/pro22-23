package ejercicio2;

public class AguaMineral extends Bebidas{
    private String manantial;

    //Constructores
    public AguaMineral() {
        super();
    }
    public AguaMineral(int idProducto, String nombreProducto, String ubicacion, int precioProducto, String envasado, String manantial) {
        super(idProducto, nombreProducto, ubicacion, precioProducto, envasado);
        this.manantial = manantial;
    }

    //Getters & Setters
    public String getManantial() {
        return manantial;
    }
    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    //Método calcularPrecio de AGUA
    @Override
    public void calcularPrecio() {
        if (getEnvasado()=="botella de cristal"){
            setPrecioProducto((double) (getPrecioProducto()*1.1));
        }
        if (getManantial()=="aguarón"){
            setPrecioProducto((double) (getPrecioProducto()+0.30));
        }
    }
}
