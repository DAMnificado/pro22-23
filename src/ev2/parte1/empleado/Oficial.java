package ev2.parte1.empleado;

import java.util.Date;

public class Oficial extends Operario {

    public String fabricacion;

    public Oficial(String nombre, Integer salario, Date fecha, String area, String nave) {
        super(nombre, salario, fecha, area, nave);
        this.fabricacion = fabricacion;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Fabricacion: " + fabricacion;
    }
}
