package ev2.parte1.Sorteo;

public class Moneda extends Sorteo {

    Moneda() {
        posibilidades=2;
    }

    public int lanzar() {
            int valorMoneda = (int)(Math.random()*posibilidades+1);
            if (valorMoneda>1){
                System.out.println("Cara");
            } else System.out.println("Cruz");
        return valorMoneda;
    }
    }
