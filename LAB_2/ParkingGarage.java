/*
 * Q7: Parking garage charges. $2.00 for up to 3 hours, $0.50 per hour excess, max $10.00.
 */
import java.util.Scanner;

public class ParkingGarage {
    public static double calculateCharges(double hours) {
        double charge = 2.00;
        if (hours > 3.0) {
            charge += Math.ceil(hours - 3.0) * 0.50;
        }
        return (charge > 10.00) ? 10.00 : charge;
    }

    public static void main(String[] args) {
        double totalReceipts = 0.0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter hours parked (-1 to quit): ");
            double hours = input.nextDouble();
            
            while (hours != -1) {
                double charge = calculateCharges(hours);
                totalReceipts += charge;
                System.out.printf("Customer charge: $%.2f%n", charge);
                System.out.printf("Total Receipts: $%.2f%n", totalReceipts);
                
                System.out.print("Enter hours parked (-1 to quit): ");
                hours = input.nextDouble();
            }
        }
    }
}