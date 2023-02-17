package ev2.aparato;

import ev2.emplea2.Empleadxs;

public class Main {

    public static void main(String[] args) {

        /**
         * FRIGO
         * Integer pvp, String color, char consumo, Integer peso, int altura
         * LAVADORA
         * Integer pvp, String color, char consumo, Integer peso,int capacidad, boolean secadoraIntegrada
         */

        Aparato[] elec = new Aparato[5];
        elec [0] = new Frigo(233,"Blanco", 'A',123, 21);
        elec [1] = new Lavadora(500,"Gris",'A',600,35,false);
        elec [2] = new Lavadora(500,"Gris",'A',600,35,true);
        elec [3] = new Frigo(233,"Blanco", 'A',123, 21);
        elec [4] = new Lavadora(500,"Gris",'A',600,35,true);

        for (Aparato i : elec) {
            System.out.println(i);
            i.aplicarDescuento();
        }
    }
}
