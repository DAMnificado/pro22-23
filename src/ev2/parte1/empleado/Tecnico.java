package ev2.parte1.empleado;

import java.util.Date;

public class Tecnico extends Operario {

    public String seccion;

    public Tecnico(String nombre, Integer salario, Date fecha, String area, String nave, String seccion) {
        super(nombre, salario, fecha, area, nave);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return super.toString() + "Seccion: " + seccion;
    }
}
