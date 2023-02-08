package ev2.Libro;

public class Libro {

    private String ISBN;
    private String titulo;
    private String nombreAutor;
    private int numeroPaginas;

    public Libro(String ISBN, String titulo, String nombreAutor, int numeroPaginas) {
        this.ISBN =ISBN;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por el autor "
                + nombreAutor + " tiene " + numeroPaginas + " páginas";
    }
}