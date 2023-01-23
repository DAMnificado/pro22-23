package ev2.empleado;

import java.util.Date;

public class Operario extends Empleado {

    public String area;
    public String nave;

    public Operario(String nombre, Integer salario, Date fecha, String area, String nave) {
        super(nombre, salario, fecha);
        this.area = area;
        this.nave = nave;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    @Override
    public String toString() {
        return super.toString() + "Area: " + area + "Nave: " + nave;
    }
}
