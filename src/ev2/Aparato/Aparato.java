package ev2.Aparato;


public class Aparato {

    public Integer pvp=100;
    public String color="blanco";
    public char consumo='F';
    /**
     *
     * el numero en la tabla ASCI o la letra entre comillas simples
     */
    public Integer peso=5;

    public Aparato() {
        this.pvp = aplicarDescuento(pvp, color, consumo);
    }

    public Aparato(Integer pvp, Integer peso) {
        this.pvp = aplicarDescuento(pvp, color, consumo);
        this.peso = peso;
    }

    public Aparato(Integer pvp, String color, char consumo, Integer peso) {

        switch (color){
            case"Blanco", "Negro", "Gris", "Azul", "Rojo" -> this.color=color;
            default -> {
                System.out.print("Se ha introducido un color no contemplado");
                System.out.println("Se ha asignado un color por defecto: Blanco. \n");
                this.color="Blanco";
            }
        }
        this.pvp=pvp;
        this.consumo = comprobarConsumo(consumo);
        this.peso = peso;
    }

    public Integer getPvp() {
        return pvp;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public char comprobarConsumo(char letra) {
        /**
        switch (consumo){
            case'A':
            case'B':
            case'C':
            case'D':
            case'E': this.consumo=consumo;
                break;
            default:this.consumo='F';
                System.out.println("Ese consumo no está en nuestro catálogo, hemos asignado el consumo por defecto: " + consumo);
        }*/
        if (letra < 65 || letra > 70){
            System.out.println("Se ha introducido un valor no contemplado");
            System.out.println("Se ha asignado un valor por defecto: 'F' .\n");
            return 'F';
        } return letra;
    }
    public Integer aplicarDescuento(Integer pvp, String color, char consumo) {
        if (!color.equals("Gris")) {
            pvp = (int) (pvp * 1.05);
        }
        switch (consumo) {
            case 'A' -> pvp = (int) (pvp * 0.8);
            case 'B' -> pvp = (int) (pvp * 0.85);
            case 'C' -> pvp = (int) (pvp * 0.9);
            case 'D' -> pvp = (int) (pvp * 0.95);
            default -> {
            }
        }
        return pvp;
    }
    public String toString() {
        return "PVP: " + pvp + "\n" + "Color: " + color + "\n" + "Consumo: " + consumo + "\n" + "Peso: " + peso + "\n";
    }
}
