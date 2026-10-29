package Lab03;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private double[] marks;
    private double total;
    private double average;
    private char grade;

    public Student(int id, String name, double[] marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void calculate() {
        total = 0;
        for (double m : marks) {
            total += m;
        }
        average = total / marks.length;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    public void display() {
        System.out.printf("ID: %d | Name: %s | Total: %.2f | Average: %.2f | Grade: %c%n",
                id, name, total, average, grade);
    }
}

public class Lab03Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            double[] marks = new double[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Mark " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }

            students[i] = new Student(id, name, marks);
            students[i].calculate();
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
