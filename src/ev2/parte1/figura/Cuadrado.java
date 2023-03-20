package ev2.parte1.figura;

/**
 * /**
 *  * Se desea modelar una aplicación con las siguientes entidades y datos: una entidad base Figura que contenga el campo color
 *  dos métodos: getColor y calcularArea, que variará en función del tipo de Figura con la que se esté trabajando en la clase.
 *  *
 *  * Deberá existir también otra clase Cuadrado que herede de Figura, que contenga un atributo lado, y que implemente los
 *  * métodos que sean necesarios.
 *  *
 *  * Además, existirá una clase Triángulo con 2 atributos base y altura y que implemente los métodos necesarios.
 *  *
 *  * Por último, crear una clase de prueba para comprobar el funcionamiento del programa, empleando polimorfismo.
 *  */
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return getLado()*getLado();
    }

    public String toString() {
        return super.toString() + "Lado: " + lado;
    }
}
