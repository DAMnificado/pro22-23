package ev2.parte1.empleados;

public abstract class Empleadxs {

    private String nombre;
    private int edad;
    private int salario;
    public final int PLUS = 300;

    public Empleadxs(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public int getPLUS() {
        return PLUS;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleadxs{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", PLUS=" + PLUS +
                '}';
    }
    /**
    ☺
**/
    public abstract double plus();
}
