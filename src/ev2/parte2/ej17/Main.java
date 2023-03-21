package ev2.parte2.ej17;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * EJERCICIO 17:
 *     Crea dos conjuntos ordenados de elementos Integer y realiza lo siguiente;
 *     -Ambos conjuntos miden lo mismo
 *     -La suma, resta, multiplicación de sus elementos en los conjuntos (primer valor + primer valor)
 *     -Crea un nuevo conjunto que contenga la union de los conjuntos iniciales.
 *     -Crea otro conjunto que contenga la diferencia de los 2 conjuntos iniciales (eliminar los elementos de c2 en c1).
 *
        - Hacer subconjuntos:
        -Desde el valor que le das SIN INCLUIR hasta la cabeza=headset
        -Desde el valor que le das INCLUYENDOLO hasta el finalr=tailset
        -Desde el valor desde el primero INCLUYENDOLO hasta el segundo SIN INCLUIR=subset

 *   TODO ADMITE NULL EXCEPTO TREESET
 *     CONJUNTO = SET (ordenado = treeSet)
 *     LISTA = ARRAYLIST
 *     VOID NO DEVUELVE NADA
 */
public class Main {

    static TreeSet<Integer> ts1 = new TreeSet<>();
    static TreeSet<Integer> ts2 = new TreeSet<>();
    private static boolean suma;

    public static void llenarConjuntos(Set ts1, Set ts2) {
        for (int i = 0; i < 10; i++) {
            ts1.add(i + 1);
            ts2.add(i + 5);
        }
    }


    public static void mostrarReutilzable (Set set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void mostrar (Set ts1, Set ts2){
        Iterator<Integer> it = ts1.iterator();
        System.out.println("El primer conjunto tiene estos valores: ");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator<Integer> it2 = ts2.iterator();
        System.out.println("El segundo conjunto tiene estos valores: ");
        while(it2.hasNext()){
        System.out.println(it2.next());
    }
}

    public static void suma (Set ts1, Set ts2) {
        Iterator<Integer> it = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        Integer a = 0;
        Integer b = 0;

        while (it.hasNext()) {

            if (it.hasNext()) {
                a = it.next();
            }
            if (it2.hasNext()) {
                b = it2.next();
            }
            System.out.println("La suma de los elementos: " + a + " + " + b + " es: " + (a + b));
        }
    }

    /** public static void sumaAleatoria(Set set, Set set2) {
        Iterator<Integer> it = set.iterator();
        Iterator<Integer> it2 = set2.iterator();
        int valor;
        int valor2;

        while (it.hasNext() || it2.hasNext()) {
            if (it.hasNext()) {
                valor = it.next();
            } else valor = 0;

            if (it2.hasNext()) {
                valor2 = it2.next();
            } else valor2 = 0;

            System.out.print("Suma elemento de los dos conjuntos: ");
            System.out.println(valor + " + " + valor2 + " = " + (valor + valor2));
        }
    }
     */
    public static void resta (Set ts1, Set ts2) {
        Iterator<Integer> it = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        Integer a = 0;
        Integer b = 0;

        while (it.hasNext()) {

            if (it.hasNext()) {
                a = it.next();
            }
            if (it2.hasNext()) {
                b = it2.next();
            }
            System.out.println("La suma de los elementos: " + a + " - " + b + " es: " + (a - b));
        }
    }
    public static void multiplicacion (Set ts1, Set ts2){
        Iterator<Integer> it = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        Integer a = 0;
        Integer b = 0;

        while (it.hasNext()){

            if(it.hasNext()){
                a = it.next();
            }
            if(it2.hasNext()){
                b = it2.next();
            }
            System.out.println("La resta de los elementos: " + a +  " * " + b +" es: " + (a*b));
        }
    }
    public static void division (Set ts1, Set ts2){
        Iterator<Integer> it = ts1.iterator();
        Iterator<Integer> it2 = ts2.iterator();
        Integer a = 0;
        Integer b = 0;

        while (it.hasNext()){

            if(it.hasNext()){
                a = it.next();
            }
            if(it2.hasNext()){
                b = it2.next();
            }
            System.out.println("La  de los elementos: " + a +  " entre "  + b +" es: " + (a/b));
        }
    }
    public static TreeSet<Integer> unirConjuntos (){
        TreeSet<Integer> union = (TreeSet<Integer>) ts1.clone();
        union.addAll(ts2);
        return union ;
    }

    public static TreeSet<Integer> separarConjuntos (){
        TreeSet<Integer> separacion = (TreeSet<Integer>) ts1.clone();
        separacion.removeAll(ts2);
        return separacion;
    }

    public static SortedSet<Integer> subConjuntoHead(){
        SortedSet<Integer> subConjuntoCabeza = ts1.headSet(5);
        return subConjuntoCabeza;
    }
    public static SortedSet<Integer> subConjuntoCola(){
        SortedSet<Integer> subConjuntoCola = ts2.tailSet(6);
        return subConjuntoCola;
    }

    public static SortedSet<Integer> subConjuntoMedio(){
        SortedSet<Integer> subConjuntoMedio = ts2.subSet(5, 8);
        return subConjuntoMedio;
    }

    public static void main (String[]args){
    /*     llenarConjuntos(ts1, ts2);
            mostrar(ts1,ts2);
        System.out.println("---------------SUMA");
            suma(ts1,ts2);
        System.out.println("---------------RESTA");
            resta(ts1,ts2);
        System.out.println("---------------MULTIPLICACIÓN");
            multiplicacion(ts1,ts2);
        System.out.println("---------------DIVISIÓN");
            division(ts1,ts2);
        System.out.println("---------------UNIÓN DE AMBOS CONJUNTOS");
        System.out.println(unirConjuntos());
        System.out.println("---------------SEPARACIÓN DE AMBOS CONJUNTOS");
        System.out.println(separarConjuntos());
        System.out.println("---------------SUBCONJUNTO CABEZA");
        System.out.println(subConjuntoHead());
        System.out.println("---------------SUBCONJUNTO COLA");
        System.out.println(subConjuntoCola());
        System.out.println("---------------SUBCONJUNTO MEDIO");
        System.out.println(subConjuntoMedio());*/
        llenarConjuntos(ts1,ts2);
        mostrarReutilzable(unirConjuntos());
    }
}
