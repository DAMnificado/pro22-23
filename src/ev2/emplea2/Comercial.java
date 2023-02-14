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
        int sueldoFinal= 0;
        if (getEdad() > 30 && getSalario()> 200) {
            sueldoFinal= (int) (getSalario()+comision+PLUS);
            setSalario(sueldoFinal);
            System.out.println("Como tienes mas de 30 años y cobras mas de 200 "+
                    "euros se te aplicará un PLUS de: " + PLUS + " a tu sueldo, ademas de tu comision");
        }
        return getSalario();
    }


    @Override
    public String toString() {
        return super.toString() + "Comision: " + comision;
    }


}
