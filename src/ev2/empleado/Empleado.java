package ev2.empleado;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {

    public String nombre;
    public Integer salario;
    public static Date fecha;

    public Empleado(String nombre, Integer salario, Date fecha) {
        this.fecha=fecha;
        this.nombre = nombre;
        this.salario = salario;
    }

    public static Date getFecha() {
        return fecha;
    }

    public static void setFecha(Date fecha) {
        Empleado.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Salario: " + "Fecha: " + fecha;
    }
}