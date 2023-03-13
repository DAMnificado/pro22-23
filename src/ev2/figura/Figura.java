package ev2.figura;

/**
 * /**
 *  * Se desea modelar una aplicación con las siguientes entidades y datos: una entidad base Figura que contenga el campo color
 *  dos métodos: getColor y calcularArea, que variará en función del tipo de Figura con la que se esté trabajando en la clase.
 *  *
 *  * Deberá existir también otra clase Cuadrado que herede de Figura, que contenga un atributo lado, y que implemente los
 *  * métodos que sean necesarios.
 *  *
 *  * Además, existirá una clase Triangulo con 2 atributos base y altura y que implemente los métodos necesarios.
 *  *
 *  * Por último, crear una clase de prueba para comprobar el funcionamiento del programa, empleando polimorfismo.
 *  */

public abstract class Figura {

    public String Color="Amarillo";

    public abstract int calcularArea();

}
