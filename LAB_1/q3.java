import java.util.Scanner;

class q3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println(sum);
        System.out.println(sum / 3.0);
        System.out.println(a * b * c);
        System.out.println(Math.max(a, Math.max(b, c)));
        System.out.println(Math.min(a, Math.min(b, c)));
        }
    }
}
