// LAB_5 Q5 - Utopia: tax 15%, net pay from hours at $12/hr
public class UtopiaTax {
    static final double TAX_RATE = 0.15;
    static final double HOURLY_RATE = 12.0;

    static double calculateTax(double grossPay) {
        return grossPay * TAX_RATE;
    }

    static double calculateNetPay(double hoursWorked) {
        double grossPay = hoursWorked * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();
        
        double grossPay = hours * HOURLY_RATE;
        double tax = calculateTax(grossPay);
        double netPay = calculateNetPay(hours);
        
        System.out.println("\nUtopia Tax Calculation:");
        System.out.println("Hours worked: " + hours);
        System.out.println("Hourly rate: $" + HOURLY_RATE);
        System.out.println("Gross pay: $" + grossPay);
        System.out.println("Tax (15%): $" + String.format("%.2f", tax));
        System.out.println("Net pay: $" + String.format("%.2f", netPay));
        sc.close();
    }
}
