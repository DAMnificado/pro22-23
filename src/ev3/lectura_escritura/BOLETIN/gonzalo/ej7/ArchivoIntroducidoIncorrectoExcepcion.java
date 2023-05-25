package ev3.lectura_escritura.BOLETIN.gonzalo.ej7;

import java.util.InputMismatchException;

public class ArchivoIntroducidoIncorrectoExcepcion extends InputMismatchException {
    public ArchivoIntroducidoIncorrectoExcepcion(String s) {
        super(s);
    }
}
