package Lab03;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double basic;
    private double gross;

    public Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    public void calculateGross() {
        double hra = 0.20 * basic;
        double tca = 0.10 * basic;
        gross = basic + hra + tca;
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Basic: %.2f | Gross: %.2f%n",
                id, name, basic, gross);
    }
}

public class Lab03Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Basic salary: ");
            double basic = sc.nextDouble();

            emp[i] = new Employee(id, name, basic);
            emp[i].calculateGross();
        }

        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
