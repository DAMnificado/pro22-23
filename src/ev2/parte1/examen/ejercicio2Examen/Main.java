package ev2.parte1.examen.ejercicio2Examen;

import ev2.parte1.examen.ejercicio1Examen.Pelicula;

public class Main {
    public static void main(String[] args) {
        Bebidas [] arrayBebidas = new Bebidas[5];
        arrayBebidas [0] = new AguaMineral(12,"Agua","Pasillo de la derecha", 20, "botella de cristal", "aguarón");
        arrayBebidas [1] = new Refrescos(17,"Coca-cola", "Pasillo de la izquierda", 5, "lata", 12);
        arrayBebidas [2] = new AguaMineral(12,"Agua","Pasillo de la derecha", 20, "plástico", "Mondariz");
        arrayBebidas [3] = new Refrescos(15,"Nestea", "Pasillo de la izquierda", 5, "lata", 4);
        arrayBebidas [4] = new AguaMineral(12,"Agua","Pasillo de la derecha", 20, "plástico", "aguarón");

        int contadorAguas=0;
        int contadorRefrescos=0;
        double sumaDePreciosAguas=0;
        double sumaDePreciosRefrescos=0;

        for (Bebidas b : arrayBebidas){
            if (b instanceof AguaMineral){
                System.out.println("El precio inicial de tu agua es: " + b.getPrecioProducto());
                b.calcularPrecio();
                System.out.println("El precio final de tu agua es: " + b.getPrecioProducto() + "\n");
                sumaDePreciosAguas+=b.getPrecioProducto();
                contadorAguas++;
            }
            if (b instanceof Refrescos){
                System.out.println("El precio inicial de tu refresco es: " + b.getPrecioProducto());
                b.calcularPrecio();
                System.out.println("El precio final de tu refresco es: " + b.getPrecioProducto() + "\n");
                contadorRefrescos++;
                sumaDePreciosRefrescos+=b.getPrecioProducto();
            }
        }
        //Refrescos
        System.out.println("***RECUENTO Y MEDIA DE LOS PRODUCTOS***");
        System.out.println("En total has tramitado: " + contadorRefrescos + " refrescos.");
        System.out.println("La media de los refrescos es: " + sumaDePreciosRefrescos/contadorRefrescos + "\n");
        //Aguas
        System.out.println("En total has tramitado: " + contadorAguas + " aguas.");
        System.out.println("La media de los aguas es: " + sumaDePreciosAguas/contadorAguas);

    }
}
