import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        String n = sc.next();

        for (int i = 0; i < n.length(); i++)
            System.out.print(n.charAt(i) + "   ");
    }
    }
}
