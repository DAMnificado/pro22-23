package ev2.parte1.empleados;

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
        int sueldoFinalR = 0;
        if (getEdad() < 25 && zona.equals(3))
            sueldoFinalR=getSalario() + getPLUS();
        sueldoFinalR= (int) (getSalario()+PLUS);
        setSalario(sueldoFinalR);
        System.out.println("Como tienes menos de 25 años y estás en la zona 3 "+
                "se te aplicará un PLUS de: " + PLUS + " a tu sueldo");
        return getSalario();
    }

}


