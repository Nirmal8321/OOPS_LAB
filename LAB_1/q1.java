import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float a = sc.nextFloat();
            float b = sc.nextFloat();

            System.out.println(a + b);
            System.out.println(a * b);
            System.out.println(a - b);
            System.out.println(a / b);
        }
    }
}