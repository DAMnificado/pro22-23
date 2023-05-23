package ev3.lectura_escritura.objetos;

import java.io.Serializable;

public class Producto implements Serializable {
    String Nombre;
    double Precio;

    public Producto(String nombre, double precio) {
        Nombre = nombre;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }
}
