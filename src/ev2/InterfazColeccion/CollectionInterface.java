package ev2.InterfazColeccion;

/**
 Escribe una clase CollectionInterface, que DECLARE los siguientes métodos:
 isEmpty(): devuelve true si la colección está vacía y false en caso contrario.
 get(): devuelve y elimina el primer elemento de la colección.
 Decremento contador
 first(): devuelve el primer elemento de la colección.
 Retorno elemento en array[contador-1]
 add(): añade un objeto por el extremo que corresponda, y devuelve true si se ha añadido y false en caso contrario.
 Incrementar contador

 A continuación, escribe una clase Pila, que implemente esta clase, utilizando para ello un array y un
 contador de objetos.
 */

public interface CollectionInterface {

  public boolean isEmpty();
  public String get();
  public String first();
  public boolean add();

}
