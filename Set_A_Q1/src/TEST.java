import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEST {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + ((long) number * i));
        }
    }
}
