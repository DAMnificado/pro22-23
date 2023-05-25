package ejercicio3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {
    public MiObjectOutputStream(FileOutputStream fileOutputStream) throws IOException {
        super(fileOutputStream);
    }
    @Override
    public void writeStreamHeader(){}
}
