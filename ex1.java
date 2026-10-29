package Lab03;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.printf("ID: %d | Title: %s | Author: %s | Price: %.2f%n",
                id, title, author, price);
    }
}

public class Lab03Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            books[i] = new Book(id, title, author, price);
            total += books[i].getPrice();
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            books[i].display();
        }

        double average = (n > 0) ? total / n : 0;
        System.out.printf("Average price: %.2f%n", average);

        sc.close();
    }
}
