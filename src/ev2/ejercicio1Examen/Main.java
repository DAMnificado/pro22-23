package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Contenido [] arrayFilm = new Contenido[2];

        arrayFilm [0] = new Pelicula("Lo que el viento se llevó", true,110);
        arrayFilm [1] = new Serie ("El temor de un hombre sabio", false, 24);

        for (Contenido p : arrayFilm){
            if (p instanceof Pelicula){
                System.out.println("Me apetece ver una peli");
                System.out.println("Por qué no vemos " +((Pelicula) p).getNombrePelicula() + " ?");
                p.reproducir();
                System.out.println("Discúlpame, tengo que ir al baño");
                p.parar();
                System.out.println("Ya estoy de vuelta!");
                p.reanudar();
            }
            if (p instanceof Serie){
                System.out.println("Esta serie tiene muy buenas criticas ");
                System.out.println("Vemos un capítulo de " + ((Serie) p).getNombreSerie() + " ?");
                p.reproducir();
                System.out.println("Me llaman al móvil, espera");
                p.parar();
                System.out.println("Nada, era Vodafone...");
                p.reanudar();
            }
        }
    }
}
