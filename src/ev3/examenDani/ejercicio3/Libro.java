package ejercicio3;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private String editorial;
    private int numPaginas;

    public Libro(String titulo, String autor, String editorial, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "titulo='" + titulo+ ", autor='" + autor +", editorial='" + editorial + ", numPaginas=" + numPaginas;
    }
}
