package ev3.excepciones.hospital;

import java.util.InputMismatchException;

public class DNIException extends InputMismatchException {
    public DNIException(String m) {
        super(m);
    }
}
