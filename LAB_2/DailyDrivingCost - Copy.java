//Q1: Application that inputs miles driven, cost per gallon, average fees, and tolls
 //to calculate and display the user's daily driving cost.

import java.util.Scanner;

public class DailyDrivingCost {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter total miles driven per day: ");
            double miles = input.nextDouble();

            System.out.print("Enter cost per gallon of gasoline: ");
            double costPerGallon = input.nextDouble();

            System.out.print("Enter average miles per gallon: ");
            double milesPerGallon = input.nextDouble();

            System.out.print("Enter parking fees per day: ");
            double parkingFees = input.nextDouble();

            System.out.print("Enter tolls per day: ");
            double tolls = input.nextDouble();

            double dailyCost = (miles / milesPerGallon) * costPerGallon + parkingFees + tolls;
            System.out.printf("Daily driving cost: $%.2f%n", dailyCost);
        }
    }
}