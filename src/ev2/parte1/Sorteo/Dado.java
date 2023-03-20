package ev2.parte1.Sorteo;

public class Dado extends Sorteo{

    Dado() {
        posibilidades=6;
    }

    public int lanzar() {
        int valorDado = (int)(Math.random()*posibilidades+1);
        System.out.println(valorDado);
        return valorDado;
    }


}
