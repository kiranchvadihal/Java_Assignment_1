import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double price;

    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    void display() {
        System.out.printf("%-10d %-30s %.2f%n", this.bookId, this.bookName, this.price);
    }
}

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details of book " + (i + 1));
            System.out.print("Book ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Book name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = Double.parseDouble(sc.nextLine().trim());
            books[i] = new Book(id, name, price);
        }
        System.out.printf("%-10s %-30s %s%n", "Book ID", "Book Name", "Price");
        for (Book book : books) {
            book.display();
        }
    }
}
