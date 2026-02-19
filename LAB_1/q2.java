import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y)
            System.out.println(x + " is larger");
        else if (y > x)
            System.out.println(y + " is larger");
        else
            System.out.println("The numbers are equal");
        }
    }
}
