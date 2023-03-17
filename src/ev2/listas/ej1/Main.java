package ev2.listas.ej1;

import java.util.*;

public class Main {

static HashSet<String> hsPos = new HashSet<>();
static LinkedHashSet<String> lhsPos = new LinkedHashSet<>();
static TreeSet<String> tPos = new TreeSet();

    //Añadimos elementos para la lista de una forma comun a todos los SETS
    public static void insercionComun(Set set) {

        for (int i = 0; i<100; i++){

            if (i % 2 == 0){
                set.add("Cadena " + i);
            }else {
                set.add("Cadena " + (i-10));
            }
        }
    }

    //Comprobar si existe elemento en la lista
public static boolean comprobarSiElemenExiste (Set set, String cad){
    return set.contains(cad);
}
    //Eliminar Elemento
public static boolean elimarElemen (Set set, String cad){
        boolean res = set.remove(cad);
        return res;
}

    //Mostrar Elemento
public static void mostrarElemen (Set set){
Iterator<String> itr = set.iterator();
    while(itr.hasNext()){
    System.out.println(itr.next());
    }


    //Tiempo de cada insercion
}public static void inserciones (){

        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("****************INSERCIONES");

        //Tiempo para HashSET
        t_comienzo = System.currentTimeMillis();
        insercionComun(hsPos);
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Lista de HashSET:");
        mostrarElemen(hsPos);
        System.out.println("Tiempo HashSET= " + t_total);

        //Tiempo para LinkedHashSET
        t_comienzo = System.currentTimeMillis();
        insercionComun(lhsPos);
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Lista de LinkedHashSET:");
        mostrarElemen(lhsPos);
        System.out.println("Tiempo LinkedHashSET= " + t_total);

        //Tiempo para TreeSet
        t_comienzo = System.currentTimeMillis();
        insercionComun(tPos);
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Lista de Treeset:");
        mostrarElemen(tPos);
        System.out.println("Tiempo TreeSET= " + t_total);

    }

    public static void comprobaciones () {

        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("**************** COMPROBACIONES");

        //HashSET
        t_comienzo = System.currentTimeMillis();
        System.out.println(comprobarSiElemenExiste(hsPos,"100"));
        System.out.println(comprobarSiElemenExiste(hsPos,"101"));
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Tiempo HashSET=" + t_total);

        //LinkedHashSET
        t_comienzo = System.currentTimeMillis();
        System.out.println(comprobarSiElemenExiste(lhsPos,"100"));
        System.out.println(comprobarSiElemenExiste(lhsPos,"101"));
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Tiempo LinkedHashSET=" + t_total);

        //TreeSET
        t_comienzo = System.currentTimeMillis();
        System.out.println(comprobarSiElemenExiste(tPos,"100"));
        System.out.println(comprobarSiElemenExiste(tPos,"101"));
        t_fin = System.currentTimeMillis();
        t_total = t_fin - t_comienzo;
        System.out.println("Tiempo TreeSET=" + t_total);

    }

    public static void borrados (){

        long t_comienzo;
        long t_fin;
        long t_total;

        System.out.println("**************** BORRADOS");

        //HashSET
        t_comienzo = System.currentTimeMillis();
        elimarElemen(hsPos,"100");
        t_fin = System.currentTimeMillis();
        t_total=t_fin - t_comienzo;
        System.out.println("Tiempo HashSET= " + t_total);

        //LinkedHashSET
        t_comienzo = System.currentTimeMillis();
        elimarElemen(lhsPos,"100");
        t_fin = System.currentTimeMillis();
        t_total=t_fin - t_comienzo;
        System.out.println("Tiempo LinkedHashSET= " + t_total);

        //TreeSET
        t_comienzo = System.currentTimeMillis();
        elimarElemen(tPos,"100");
        t_fin = System.currentTimeMillis();
        t_total=t_fin - t_comienzo;
        System.out.println("Tiempo TreeSET= " + t_total);
    }

    public static void main(String[] args) {
        inserciones();
        comprobaciones();
        borrados();
    }






}
