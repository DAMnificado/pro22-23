package ev2.parte1.examen.ejercicio2Examen;

public class Alimentacion extends Productos{

    private String categoria="Embutidos";
    private boolean gluten=false;

    //Constructores
    public Alimentacion() {
        super();
        this.gluten=true;
    }

    public Alimentacion(int idProducto, String nombreProducto, String ubicacion, int precioProducto, String categoria, boolean gluten) {
        super(idProducto, nombreProducto, ubicacion, precioProducto);
        this.categoria = categoria;
        this.gluten = gluten;
    }

    //Getters & Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
}
