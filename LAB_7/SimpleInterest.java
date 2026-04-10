// LAB_7 Q1 - Principal, annual rate, months -> balance (simple interest)
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Annual interest rate (decimal e.g. 0.05): ");
        double rate = sc.nextDouble();
        System.out.print("Number of months: ");
        int months = sc.nextInt();
        double years = months / 12.0;
        double interest = principal * rate * years;
        double balance = principal + interest;
        System.out.println("Balance after " + months + " months: " + balance);
        sc.close();
    }
}
