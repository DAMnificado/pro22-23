package ev2.parte2.ej18;

import java.util.Iterator;
import java.util.TreeMap;



/*EJERCICIO 18:
        Implementar una agenda de teléfonos, donde cada contacto tenga como clave un numero entero, y como valor un nombre
        y un telefono.
        Desarrollar metodos para:
        -insertar una nueva entrada en la agenda,
        -buscar un contacto por nombre, mostrando por pantalla su numero de telefono asociado,
        -eliminar un contacto por nombre,
        -listar todos los contactos, y
        -listar todos aquellos contactos que comienzan por una determinada letra.*/
public class agenda {

    private static TreeMap<Integer, contacto> agenda = new TreeMap<>();
    private static int idSiguiente = 0;

    public static void insertarContacto(contacto c) {
        if (!agenda.containsValue(c)) {
            agenda.put(idSiguiente, c);
            idSiguiente++;
        } else System.out.println("El contacto ya esta en la agenda");
    }

    public static void buscarTelefonoPorNombre(String nombre){
        Iterator<Integer> it = agenda.keySet().iterator();

        while(it.hasNext()) {
            int clave = it.next();
        contacto c = agenda.get(clave);

        if (c.getNombre().equals(nombre)){
            System.out.println("El contacto: " + nombre + " tiene asignado este teléfono: " + c.getTelefono());
            return;
        }
        }

    }
    public static void eliminarPorNombre (String nombre){
        Iterator <Integer> it = agenda.keySet().iterator();
        while (it.hasNext()){
            int clave = it.next();
            contacto c = agenda.get(clave);
            if (c.getNombre().equals(nombre)){
                agenda.remove(clave);
                return;
            }
        }
    }
    public static void listarContactos (){
        Iterator<Integer> it = agenda.keySet().iterator();
        while (it.hasNext()){
            int clave = it.next();
            contacto c = agenda.get(clave);
            System.out.println("Id: " + clave + ", Nombre: " + c.getNombre() + "Telefono: " + c.getTelefono());
        }
    }
    public static void listarPorLetra(String letra){
        Iterator<Integer> it = agenda.keySet().iterator();
        while(it.hasNext()){
            int clave = it.next();
            contacto c = agenda.get(clave);
            char ch = letra.charAt(0);
            if (c.getNombre().charAt(0)==ch){
                System.out.println("Id: " + clave + ", Nombre: " + c.getNombre() + "Teléfono: " + c.getTelefono());
            }
        }


    }

    public static void main(String[] args) {

        agenda a = new agenda();

        a.insertarContacto(new contacto("Marcos", 111));
        a.insertarContacto(new contacto("Marcos", 222));
        a.insertarContacto(new contacto("Pepe", 333));
        a.insertarContacto(new contacto("Juan", 444));
        System.out.println("------LISTO TODOS");
        listarContactos();
        System.out.println("------ELIMINO EL QUE EMPIEZA POR P");
        listarPorLetra("P");
        System.out.println("------ELIMINO EL QUE SE LLAME MARCOS Y TE LO ENSEÑO");
        eliminarPorNombre("Marcos");
        listarContactos();
    }

}