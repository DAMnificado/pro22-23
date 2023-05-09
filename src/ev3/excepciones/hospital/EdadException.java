package ev3.excepciones.hospital;

import java.util.InputMismatchException;

public class EdadException extends InputMismatchException {
    public EdadException(String m) {
        super(m);
    }
}
