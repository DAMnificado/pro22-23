package ev2.emplea2;

public class Comercial extends Empleadxs{

    private double comision;

    public Comercial(String nombre, int edad, int salario, double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double plus() {
        int plusComercial = 0;
        if (getEdad() > 30 && getSalario()> 200)
            plusComercial= (int) (getSalario() + getPLUS() + comision);

            return plusComercial;
    }

    @Override
    public String toString() {
        return super.toString() + "Comision: " + comision;
    }


}
