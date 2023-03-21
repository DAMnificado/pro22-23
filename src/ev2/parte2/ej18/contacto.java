package ev2.parte2.ej18;

public class contacto {

    private String nombre;
    private int telefono;


    public contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String toString() {
        return "contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }

}