package ev2.parte1.figura;

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
public class Main {

    public static void main(String[] args) {

        Figura f1 = new Cuadrado(5);
        System.out.print("El area del cuadrado es de:  ");
        System.out.println(f1.calcularArea());
        System.out.print("El area del triángulo es de:  ");
        Figura f2 = new Triangulo(20, 30);
        System.out.println(f2.calcularArea());
    }
}
