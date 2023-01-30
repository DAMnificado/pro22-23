package ev2.Vida;

public class Animal extends SerVivo {

    public Integer peso;
    public Integer altura;

    public Animal(String nombre, String nombreCientifico, Integer altura, Integer peso) {
        super(nombre, nombreCientifico);
        this.altura=altura;
        this.peso=peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getPeso() {
        return peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void alimentar(){
        System.out.println("Aliemntar animal");
    }
}
