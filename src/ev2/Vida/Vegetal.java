package ev2.Vida;

public class Vegetal extends SerVivo{
    public Integer altura;

    public Vegetal(String nombre, String nombreCientifico, Integer altura) {
        super(nombre, nombreCientifico);
        this.altura=altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getAltura() {
        return altura;
    }

    public void alimentar(){
        System.out.println("Aliemntar vegetal");
    }
}
