package ev2.Libro;

public class Autor extends Person {
    private String alias;
    private String primeraPublicacion;

    public Autor(String nombre, String DNI, String fechaNacimiento, String nacionalidad, int telefono, String direccion, String alias, String primeraPublicacion) {
        super(nombre, DNI, fechaNacimiento, nacionalidad, telefono, direccion);
        this.alias = alias;
        this.primeraPublicacion = primeraPublicacion;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setPrimeraPublicacion(String primeraPublicacion) {
        this.primeraPublicacion = primeraPublicacion;
    }

    public String getAlias() {
        return alias;
    }

    public String getPrimeraPublicacion() {
        return primeraPublicacion;
    }

    public String toString() {
        return "Alias: " + alias + "\nFecha de la primera publicación: " + primeraPublicacion;
    }
}

