import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Customer {
    int cid;
    String cname;
    double billAmount;

    Customer(int cid, String cname, double billAmount) {
        this.cid = cid;
        this.cname = cname;
        this.billAmount = billAmount;
    }

    void display() {
        System.out.printf("%-10d %-30s %.2f%n", this.cid, this.cname, this.billAmount);
    }
}

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of customers: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        if (n < 0) {
            System.out.println("Number of customers cannot be negative.");
            return;
        }
        Customer[] customers = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of customer " + (i + 1));
            System.out.print("Customer ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Customer name: ");
            String name = sc.nextLine();
            System.out.print("Bill amount: ");
            double amount = Double.parseDouble(sc.nextLine().trim());
            customers[i] = new Customer(id, name, amount);
        }
        Arrays.sort(customers, Comparator.comparingDouble(customer -> customer.billAmount));
        System.out.println("Customers in ascending order of bill amount:");
        System.out.printf("%-10s %-30s %s%n", "ID", "Name", "Bill Amount");
        for (Customer customer : customers) {
            customer.display();
        }
    }
}
