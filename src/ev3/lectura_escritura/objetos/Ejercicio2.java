package ev3.lectura_escritura.objetos;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String [] nombreProd = {"Agua", "Arroz", "Tomate"};
        double [] precioProd = {0.8,1.2,0.6};

        try (ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(".\\src\\ActividadesStreams\\BoletinV2\\ejercicio2.txt"))){
            for(int i=0; i<nombreProd.length; i++){
                dos.writeObject(new Producto(nombreProd[i],precioProd[i]));
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException("Error");
        }catch (IOException e){
            throw new RuntimeException("Error");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nombre de producto");
        String nombre =sc.nextLine();

        File fichero = new File(".\\src\\ActividadesStreams\\BoletinV2\\nuevoArchivo.txt");
        try(ObjectInputStream dis = new ObjectInputStream(new FileInputStream(".\\src\\ActividadesStreams\\BoletinV2\\ejercicio2.txt"))){
            ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(fichero));
            while(dis.available()!=0){
                Producto valor = (Producto) dis.readObject();

                if(valor.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Elemento encontrado");
                }else{
                    dos.writeObject(valor);
                }
            }
            dos.close();

        }catch (FileNotFoundException e){
            throw new RuntimeException("Error");
        }catch (IOException e){
            throw new RuntimeException("Error");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }



}
