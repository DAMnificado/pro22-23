package ev2.aparato;


public abstract class Aparato {

    private Integer pvp = 100;

    private String color = "Blanco";

    private char consumo = 'F';

    private Integer peso = 5;

    public void setPvp(Integer pvp) {
        this.pvp = pvp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Integer peso) {
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

    public Aparato() {
    }

    public Aparato(Integer pvp, Integer peso) {
        this.pvp = aplicarDescuento();
        this.peso = peso;
    }

    public Aparato(Integer pvp, String color, char consumo, Integer peso) {
        switch (color) {
            case "Blanco", "Negro", "Rojo", "Azul", "Gris" -> this.color = color;
            default -> {
                System.out.print("Se ha introducido un valor no contemplado, ");
                System.out.println("se ha asignado el color por defecto 'Blanco'. \n");
                this.color = "Blanco";
            }
        }
        this.consumo = comprobarConsumo(consumo);
        this.pvp = aplicarDescuento();
        this.peso = peso;
    }

    public char comprobarConsumo(char letra) {
        if (letra < 65 || letra > 70) {
            System.out.print("Se ha introducido un valor no contemplado, ");
            System.out.println("se ha asignado el consumo por defecto 'F'.\n");
            return 'F';
        }
        return letra;
    }

    public Integer aplicarDescuento() {
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
    @Override
    public String toString() {
        return "PVP: " + pvp + "\n" + "Color: " + color + "\n" + "Consumo: " + consumo + "\n" + "Peso: " + peso + "\n";
    }
}
