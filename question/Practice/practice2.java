import java.util.Scanner;

class Series {
    int calculateSum(int n) {
        int totalSum = 0;

        for (int i = 1; i <= n; i++) {
            int term = 1;
            int exponent = n - i + 1; 

            for (int j = 1; j <= exponent; j++) {
                term = term * i;
            }

            System.out.println(i + "power" + exponent + " = "+ term);
            totalSum = totalSum + term;
        }
        return totalSum;
    }
}

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            Series obj = new Series();
            int sum = obj.calculateSum(a);
            System.out.println("The sum is" + sum);
        }
        sc.close();
    }
}