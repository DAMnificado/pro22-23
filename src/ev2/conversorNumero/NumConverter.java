package ev2.conversorNumero;

public class NumConverter {
    private final Integer number;
    public static String name="eduardo";


    public NumConverter(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getNumber(char loquerecibo) {
        return switch (loquerecibo) {
            case 'B' -> Integer.toBinaryString(number);
            case 'H' -> Integer.toHexString(number);
            case 'O' -> Integer.toOctalString(number);
            default -> "Error";
        };
    }
}

