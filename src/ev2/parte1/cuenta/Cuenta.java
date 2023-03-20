package ev2.parte1.cuenta;

public class Cuenta {

    public String titular;
    public double cantidad;


    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad= cantidad;

    }

    public double getCantidad() {
        return cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void ingresar(double cantidad){
        if (cantidad >= 0) {
            this.cantidad += cantidad;
        }
    }
    
    public double retirar(double cantidad) {
        this.cantidad -= cantidad;
        if (this.cantidad < 0.0) {
            System.out.print("Se ha solicitado retirar " + cantidad + "$ ");
            cantidad = cantidad + this.cantidad;
            System.out.println("pero el maximo a retirar quedando a 0 la cuenta es: " + cantidad + "€");
            this.cantidad=0.0;
        }
        return cantidad;
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nCantidad: " + cantidad + "\n";
    }
}
