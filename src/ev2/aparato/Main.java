package ev2.aparato;

/**
 * Ahora crea una clase ejecutable que realice lo siguiente:
 *
 * Crea un array de Electrodomesticos de 5 posiciones.
 * Ejecutar el método aplicarDescuento() para cada uno de los elementos.
 * Deberás mostrar el precio de cada tipo de aparato (instanceof)
 */

public class Main {
    public static void main(String[] args) {
        Aparato [] arrayAparatos = new Aparato[5];

        arrayAparatos [0] = new Aparato();
        arrayAparatos [1] = new Frigorifico(12,8);
        arrayAparatos [2]  = new Frigorifico(12,"blanco", 'A', 21, 5, 34);
        arrayAparatos [3] = new Lavadora(12, 145, true, 23);
        arrayAparatos [4] = new Frigorifico(83,32);


        for(Aparato a : arrayAparatos){

            System.out.println("El precio inicial: " + a.getPVP());
            a.aplicarDescuento();
            System.out.println("Tras el descuento: " + a.getPVP());

            if (a instanceof Frigorifico){
                ((Frigorifico) a).getCapacidad();
                System.out.print("La capacidad de tu frigorifico es de: ");
                System.out.println(((Frigorifico) a).getCapacidad());
            }
            if (a instanceof Lavadora){
                ((Lavadora) a).getKilos();
                System.out.print("Kilos de tu lavadora: ");
                System.out.println(((Lavadora) a).getKilos());
            }
        }
    }
}
