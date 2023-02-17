package ev2.InterfazVehiculo;

public class Moto implements Vehiculo{
 public int veloMoto;

    public Moto(int veloMoto) {
        this.veloMoto = veloMoto;
    }

    @Override
    public int frenar(int decre) {
        int frenadoMoto = 0;
        frenadoMoto = veloMoto - decre;
        return frenadoMoto;
    }

    @Override
    public String acelerar(int incre) {
        int aceleradoMoto = 0;
        aceleradoMoto = veloMoto + incre;

        if (aceleradoMoto>velocidadMax){
            System.out.println("Superas la velocidad máxima");
        }
        return "Tu velocidad actual es: " + aceleradoMoto;
    }
}
