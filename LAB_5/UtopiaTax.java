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
        double hours = 40;
        double gross = hours * HOURLY_RATE;
        System.out.println("Gross pay: $" + gross);
        System.out.println("Tax (15%): $" + calculateTax(gross));
        System.out.println("Net pay: $" + calculateNetPay(hours));
    }
}
