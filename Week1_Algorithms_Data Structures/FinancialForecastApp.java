import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinancialForecastApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> revenueData = new ArrayList<>();

        System.out.println("Enter the number of months for which you have revenue data:");
        int months = scanner.nextInt();

        // Input revenue data
        for (int i = 1; i <= months; i++) {
            System.out.print("Enter revenue for month " + i + ": ₹");
            revenueData.add(scanner.nextDouble());
        }

        // Calculate total and average revenue
        double totalRevenue = 0;
        for (double revenue : revenueData) {
            totalRevenue += revenue;
        }

        double averageRevenue = totalRevenue / revenueData.size();

        // Forecast next 3 months based on average
        System.out.println("\n--- Financial Report ---");
        System.out.println("Total Revenue: ₹" + totalRevenue);
        System.out.printf("Average Monthly Revenue: ₹%.2f\n", averageRevenue);

        System.out.println("\n--- Forecast for Next 3 Months ---");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Month +%d Forecast: ₹%.2f\n", i, averageRevenue);
        }
    }
}
