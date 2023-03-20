package ev2.parte1.Libro;

public class Person {

    public String nombre;
    public String DNI;
    public String fechaNacimiento;
    public String nacionalidad;
    public int telefono;
    public String direccion;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Person(String nombre, String DNI, String fechaNacimiento, String nacionalidad, int telefono, String direccion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
            return "DNI: " + DNI + "\nNombre: " + nombre + "\nFecha de nacimiento: "
                    + fechaNacimiento + "\nNacionalidad: " + nacionalidad
                    + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
        }
    }

