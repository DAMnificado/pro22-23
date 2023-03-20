package ev2.parte1.empleado;

import java.util.Date;

public class Directivo extends Empleado {

    public String cargo;
    public String departamento;

    public Directivo(String nombre, Integer salario, Date fecha, String cargo, String departamento) {
        super(nombre, salario, fecha);
        this.cargo = cargo;
        this.departamento = departamento;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "Cargo: " + cargo + "Departamento: " + departamento;

    }
}
