import java.util.Arrays;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number of elements cannot be negative.");
            return;
        }
        int[] numbers = new int[n];
        long sum = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Ascending order: " + Arrays.toString(numbers));
    }
}
