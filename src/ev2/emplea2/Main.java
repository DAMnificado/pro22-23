package ev2.emplea2;

public class Main {
    public static void main(String[] args) {

        Empleadxs [] emp = new Empleadxs[2];
        emp [0] = new Comercial("hector", 34, 23, 34);
        emp [1] = new Repartidor("hector", 34, 23, "3");

        for (Empleadxs i : emp)
            System.out.println(i.toString());
    }
}
