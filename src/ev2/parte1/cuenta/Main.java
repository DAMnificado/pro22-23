package ev2.parte1.cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta ("Marcos", 100);
        System.out.println(c1.toString());
        Cuenta c2 = new Cuenta ("Gon", 50);
        System.out.println(c2.toString());


        c1.ingresar(900);
        System.out.println(c1.toString());


        c2.ingresar(c1.retirar(100));
        System.out.println(c1.toString());
        System.out.println(c2.toString());


        c1.ingresar(c2.retirar(200));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
;    }
}
