package ev2.emplea2;

public class Repartidor extends Empleadxs{

    public String zona;

    public Repartidor(String nombre, int edad, int salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return super.toString() + "Zona: " + zona;
    }

    public double plus() {
        int plusRepartidor = 0;
        if (getEdad() < 25 && zona.equals(3))
            plusRepartidor=getSalario() + getPLUS();
        return plusRepartidor;
    }

}


