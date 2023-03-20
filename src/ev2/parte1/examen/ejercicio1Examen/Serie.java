package ev2.parte1.examen.ejercicio1Examen;


public class Serie implements Contenido {

    private String nombreSerie;
    private boolean reproduciendoseOParadoSerie;
    private int numeroDeEpisodios;

    public Serie(String nombreSerie, boolean reproduciendoseOParadoSerie, int numeroDeEpisodios) {
        this.nombreSerie = nombreSerie;
        this.reproduciendoseOParadoSerie = reproduciendoseOParadoSerie;
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public boolean isReproduciendoseOParadoSerie() {
        return reproduciendoseOParadoSerie;
    }

    public void setReproduciendoseOParadoSerie(boolean reproduciendoseOParadoSerie) {
        this.reproduciendoseOParadoSerie = reproduciendoseOParadoSerie;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    @Override
    public void reproducir() {
        System.out.println("****Reproduciendo serie****");
    }

    @Override
    public void parar() {
        System.out.println("****La película se ha parado****");
    }

    @Override
    public void reanudar() {
        System.out.println("****Reanudando serie****");
    }
}
