// LAB_6 Q2 - $5 per ticket, $20 + $0.50 per attendee cost
import java.util.Scanner;

public class MovieTheaterProfit {
    static final double TICKET_PRICE = 5.0;
    static final double FIXED_COST = 20.0;
    static final double COST_PER_ATTENDEE = 0.50;

    static double calculateTotalProfit(int attendees) {
        double income = attendees * TICKET_PRICE;
        double cost = FIXED_COST + attendees * COST_PER_ATTENDEE;
        return income - cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of attendees: ");
        int n = sc.nextInt();
        System.out.println("Total profit: $" + calculateTotalProfit(n));
        sc.close();
    }
}
