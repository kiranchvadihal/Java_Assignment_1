import java.math.BigInteger;

class IntegerNumber {
    private BigInteger number;

    IntegerNumber(BigInteger number) {
        this.number = number;
    }

    BigInteger square() {
        return this.number.pow(2);
    }

    BigInteger cube() {
        return this.number.pow(3);
    }
}

public class TEST {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one integer in Program arguments.");
            return;
        }
        try {
            IntegerNumber number = new IntegerNumber(new BigInteger(args[0]));
            System.out.println("Square: " + number.square());
            System.out.println("Cube: " + number.cube());
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer.");
        }
    }
}
