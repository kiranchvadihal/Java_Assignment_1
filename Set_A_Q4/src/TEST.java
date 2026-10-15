import java.util.Scanner;

class MyDate {
    int dd;
    int mm;
    int yy;

    MyDate() {
        this(1, 1, 2000);
    }

    MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.printf("%02d-%02d-%02d%n", this.dd, this.mm, Math.floorMod(this.yy, 100));
    }
}

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyDate defaultDate = new MyDate();
        System.out.print("Default date: ");
        defaultDate.display();
        System.out.print("Enter day, month and year: ");
        MyDate date = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Entered date: ");
        date.display();
    }
}
