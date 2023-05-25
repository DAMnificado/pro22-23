package ev3.lectura_escritura.BOLETIN.yo.loIntentoFresas;

import java.io.IOException;

public class MainFresas {

    public static void main(String[] args) throws RuntimeException, IOException {
        Rapp.addRegistro();
        Rapp.listarArchivo();
        Rapp.buscar();
        Rapp.borrar();
    }
}
