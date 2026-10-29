package Lab03;
import java.util.Scanner;

public class Lab03Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        String[] title = new String[n];
        String[] author = new String[n];
        double[] price = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\n----Book " + (i + 1) + "----");
            System.out.print("ID: ");
            id[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Title: ");
            title[i] = sc.nextLine();
            System.out.print("Author: ");
            author[i] = sc.nextLine();
            System.out.print("Price: ");
            price[i] = sc.nextDouble();
            total += price[i];
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("ID: %d | Title: %s | Author: %s | Price: %.2f%n",
                    id[i], title[i], author[i], price[i]);
        }

        double average = (n > 0) ? total / n : 0;
        System.out.printf("\nAverage price: $%.2f%n", average);

        sc.close();
    }
}
