// LAB_9 Q4 - Two players, random numbers; higher wins, points = difference
import java.util.Scanner;
import java.util.Random;

public class TwoPlayerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Player 1 enter any number: ");
        sc.nextInt();
        System.out.print("Player 2 enter any number: ");
        sc.nextInt();
        int n1 = rand.nextInt(100) + 1;
        int n2 = rand.nextInt(100) + 1;
        System.out.println("Player 1 got: " + n1 + ", Player 2 got: " + n2);
        int diff = Math.abs(n1 - n2);
        if (n1 > n2) System.out.println("Player 1 wins! Points: " + diff);
        else if (n2 > n1) System.out.println("Player 2 wins! Points: " + diff);
        else System.out.println("Draw!");
        sc.close();
    }
}
