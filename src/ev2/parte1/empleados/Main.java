package ev2.parte1.empleados;

public class Main {
    public static void main(String[] args) {

        Empleadxs [] emp = new Empleadxs[2];
        emp [0] = new Comercial("Héctor", 34, 220, 34);
        emp [1] = new Repartidor("Marta", 10, 200, "3");

        for (Empleadxs i : emp) {
            System.out.println(i);
            i.plus();
        }
    }
}
