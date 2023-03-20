package ev2.parte1.Libro;


public class Main {
    public static void main(String[] args) {

        Libro [] book = new Libro [2];

        book [0] = new Libro ("23434F", "Amar en tiempos revueltos",
                "Luis Pedrerol", 666);
        book [1] = new Libro ("98565L", "Noches en vela",
                "Luis Pedrerol", 584);

        System.out.println(book[0]);
        System.out.println(book[1]);

        Autor Luis = new Autor ("Luis Pedrerol", "352524W",
                "31/1/1967", "Español",
                636737373, "C/Barcelona 23 1ºE", "Pedrito", "12/12/2012");
        System.out.println(Luis);


        Person p1 = new Person("Luis Pedrerol", "352524W",
                "31/1/1967", "Español",
                636737373, "C/Barcelona 23 1ºE");

        System.out.println(p1);


        if (book [0] .getNumeroPaginas() > book [1] .getNumeroPaginas()){

            System.out.println("El libro con mas paginas es " + book [0] .getTitulo());
        } else System.out.println("El libro con mas paginas es " + book [1] .getTitulo());
        
    }
}
