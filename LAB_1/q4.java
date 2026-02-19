import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int r = sc.nextInt();

        System.out.println(2 * r);
        System.out.println(2 * Math.PI * r);
        System.out.println(Math.PI * r * r);
        }
    }
}
