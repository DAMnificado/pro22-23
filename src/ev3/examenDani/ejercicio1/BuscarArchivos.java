package ejercicio1;

import java.io.File;
import java.util.Scanner;

public class BuscarArchivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca directorio");
        String directorio = sc.nextLine();
        String iniciales;
        do{
            System.out.println("introduzca 4 caracteres inicales");
            iniciales = sc.nextLine();
        }while (iniciales.length()!=4);
        File f=new File(directorio);
        File[] listado=f.listFiles();
        for (int i=0;i< listado.length;i++) {
            if(listado[i].getName().length()>=4){
                    if(listado[i].getName().substring(0,4).equals(iniciales)) {
                         System.out.println(listado[i].getName() + " es un directorio " + listado[i].isDirectory());
                         System.out.println(listado[i].getName() + " se puede escribir " + listado[i].canWrite() + " se puede leer " + listado[i].canRead());
                        System.out.println(listado[i].getName() + " tiene un tamaño de " + (listado[i].length() / 1024) + " KB");
                    }
            }
        }

    }
}

