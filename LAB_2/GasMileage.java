/*
 * Q5: Gas Mileage app. Input miles driven and gallons used for each trip.
 * Calculate MPG for each trip and combined MPG for all trips.
 */
import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        int miles, gallons, totalMiles = 0, totalGallons = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter miles (-1 to quit): ");
            miles = input.nextInt();

            while (miles != -1) {
                System.out.print("Enter gallons: ");
                gallons = input.nextInt();
                
                if (gallons <= 0) {
                    System.out.println("Gallons must be > 0. Skipping trip.");
                } else {
                    totalMiles += miles;
                    totalGallons += gallons;

                    System.out.printf("Trip MPG: %.2f%n", (double)miles / gallons);
                    System.out.printf("Combined MPG: %.2f%n", (double)totalMiles / totalGallons);
                }

                System.out.print("Enter miles (-1 to quit): ");
                miles = input.nextInt();
            }
        }
    }
}