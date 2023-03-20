package ev2.parte1.Vida;

public abstract class SerVivo {

    public String nombre;
    public String nombreCientifico;

    public SerVivo(String nombre, String nombreCientifico) {
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public abstract void alimentar();
}
