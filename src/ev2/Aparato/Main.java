package ev2.Aparato;

public class Main {

    public static void main(String[] args) {

        Aparato apa1 = new Aparato(150, "gris", 'A',5 );
        System.out.println(apa1);
        Aparato apa2 = new Aparato ();
        System.out.println(apa2);
        Aparato apa3 = new Aparato( 21, 12);
        System.out.println(apa3);
    }
}
