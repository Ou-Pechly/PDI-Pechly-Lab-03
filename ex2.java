package Lab03;
import java.util.Scanner;

class City {
    private double celsius;
    private double fahrenheit;

    public City(double celsius) {
        this.celsius = celsius;
    }

    public void convert() {
        fahrenheit = (celsius * 9 / 5) + 32;
    }

    public void display(int number) {
        System.out.printf("City %d: %.2f C = %.2f F%n", number, celsius, fahrenheit);
    }
}

public class Lab03Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        City[] cities = new City[n];

        for (int i = 0; i < n; i++) {
            System.out.print("City " + (i + 1) + " temperature (C): ");
            double c = sc.nextDouble();
            cities[i] = new City(c);
            cities[i].convert();
        }

        System.out.println("\n--- Temperatures ---");
        for (int i = 0; i < n; i++) {
            cities[i].display(i + 1);
        }

        sc.close();
    }
}
