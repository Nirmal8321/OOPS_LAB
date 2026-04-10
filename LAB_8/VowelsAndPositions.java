// LAB_8 Q2 - Vowels and their positions
import java.util.Scanner;

public class VowelsAndPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = sc.nextLine().toLowerCase();
        sc.close();
        String vowels = "aeiou";
        System.out.println("Vowel  Position");
        for (int i = 0; i < line.length(); i++) {
            if (vowels.indexOf(line.charAt(i)) >= 0)
                System.out.println(line.charAt(i) + "      " + i);
        }
    }
}
