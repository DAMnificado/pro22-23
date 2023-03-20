package ev2.parte1.examen.ejercicio1Examen;


public class Pelicula implements Contenido{

    private String nombrePelicula;
    private boolean reproduciendoseOParadoPeli;
    private int duracionPelicula;

    public Pelicula(String nombrePelicula, boolean reproduciendoseOParadoPeli, int duracionPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.reproduciendoseOParadoPeli = reproduciendoseOParadoPeli;
        this.duracionPelicula = duracionPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public boolean isReproduciendoseOParadoPeli() {
        return reproduciendoseOParadoPeli;
    }

    public void setReproduciendoseOParadoPeli(boolean reproduciendoseOParadoPeli) {
        this.reproduciendoseOParadoPeli = reproduciendoseOParadoPeli;
    }

    public int getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(int duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public void reproducir() {
        System.out.println("****Reproduciendo película****");
    }

    @Override
    public void parar() {
        System.out.println("****La pelicula se ha parado****");
    }

    @Override
    public void reanudar() {
        System.out.println("****Reanudando serie****");
    }
}
