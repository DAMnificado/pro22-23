package ev2.empleado;

import ev2.herencia.pez.Shark;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public static Empleado[] arrayEmpleado = new Empleado [7];


    public static void main(String[] args) {

     try {
         Date d = sdf.parse("01/01/2000");
         arrayEmpleado[0]=new Empleado ("Pepe",2000, d);
         arrayEmpleado[1]=new Directivo ("Luis", 5000,d,"Instructor","Comercial");
         arrayEmpleado[2]=new Operario ("Sofia", 1500,d,"51", "3");
         arrayEmpleado[3]=new Oficial ("Juan", 3000, d , "32","2");
         arrayEmpleado[4]=new Tecnico ("Pedro", 2500,d,"66", "5", "para adultos");
         arrayEmpleado[5]=new Empleado ("Marta",2000, d);
         arrayEmpleado[6]=new Empleado ("Ana",2000, d);
         System.out.println(arrayEmpleado[0]);
         System.out.println(arrayEmpleado[1]);
         System.out.println(arrayEmpleado[2]);
         System.out.println(arrayEmpleado[3]);
         System.out.println(arrayEmpleado[4]);
         System.out.println(arrayEmpleado[5]);
         System.out.println(arrayEmpleado[6]);

     }catch(ParseException e){
         throw new RuntimeException(e);
     }

    }
}


