/*
 * Q6: Credit limit calculator. Check if new balance (beginning + charges - credits) exceeds limit.
 */
import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            int accountNumber = input.nextInt();
            System.out.print("Enter beginning balance: ");
            double bal = input.nextDouble();
            System.out.print("Enter charges: ");
            double charges = input.nextDouble();
            System.out.print("Enter credits: ");
            double credits = input.nextDouble();
            System.out.print("Enter credit limit: ");
            double limit = input.nextDouble();

            double newBal = bal + charges - credits;
            System.out.printf("Account: %d New Balance: %.2f%n", accountNumber, newBal);

            if (newBal > limit) System.out.println("Credit Limit Exceeded");
        }
    }
}