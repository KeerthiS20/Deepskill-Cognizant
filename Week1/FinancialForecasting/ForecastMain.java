package FinancialForecasting;
import java.util.Scanner;

public class ForecastMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of months of revenue data:");
        int n = scanner.nextInt();

        double[] revenue = new double[n];
        System.out.println("Enter monthly revenue:");
        for (int i = 0; i < n; i++) {
            revenue[i] = scanner.nextDouble();
        }

        System.out.println("Enter window size for moving average:");
        int window = scanner.nextInt();

        double[] forecast = Forecasting.movingAverage(revenue, window);

        System.out.println("\nForecasted Revenue (Moving Average):");
        for (int i = 0; i < forecast.length; i++) {
            System.out.printf("Month %d: %.2f\n", (i + window), forecast[i]);
        }
    }
}
