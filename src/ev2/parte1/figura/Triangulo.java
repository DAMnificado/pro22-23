package ev2.parte1.figura;

 /**
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
public class Triangulo extends Figura{

    private int base;
    private int altura;


    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int calcularArea() {
        return getBase()*getAltura()/2;
    }

    @Override
    public String toString() {
        return super.toString() + "Base: " + base + "Altura: " + altura;
    }
}
