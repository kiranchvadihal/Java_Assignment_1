import java.util.Scanner;

class person {
    int pid;
    String pname;
    int age;
    String gender;

    person() {
        this(0, "Unknown", 0, "Unknown");
    }

    person(int pid, String pname) {
        this(pid, pname, 0, "Unknown");
    }

    person(int pid, String pname, int age, String gender) {
        this.pid = pid;
        this.pname = pname;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.printf("%-10d %-25s %-10d %s%n", this.pid, this.pname, this.age, this.gender);
    }
}

public class TEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person defaultPerson = new person();
        person partialPerson = new person(1, "Sample");
        System.out.println("Default constructor:");
        defaultPerson.display();
        System.out.println("Overloaded constructor:");
        partialPerson.display();
        person[] people = new person[5];
        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter details of person " + (i + 1));
            System.out.print("Person ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            people[i] = new person(id, name, age, gender);
        }
        System.out.printf("%-10s %-25s %-10s %s%n", "ID", "Name", "Age", "Gender");
        for (person p : people) {
            p.display();
        }
    }
}
