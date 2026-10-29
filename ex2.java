package Lab03;
import java.util.Scanner;
public class Lab03Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Enter number of cities: ");
        n = sc.nextInt();

        double[] celsius = new double[n];
        double[] fahrenheit = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("City " + (i + 1) + " temperature (C): ");
            celsius[i] = sc.nextDouble();
            fahrenheit[i] = (celsius[i] * 9 / 5) + 32;
        }

        System.out.println("\n--- Temperatures ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("City %d: %.2f C = %.2f F%n", i + 1, celsius[i], fahrenheit[i]);
        }

        sc.close();
    }
}
