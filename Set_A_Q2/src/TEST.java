import java.math.BigInteger;

public class TEST {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter one integer in Program arguments.");
            return;
        }
        try {
            BigInteger number = new BigInteger(args[0]);
            String digits = number.abs().toString();
            BigInteger reversed = new BigInteger(new StringBuilder(digits).reverse().toString());
            if (number.signum() < 0) {
                reversed = reversed.negate();
            }
            System.out.println("Reversed number: " + reversed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer.");
        }
    }
}
