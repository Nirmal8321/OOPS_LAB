// LAB_8 Q5 - First character of each word to uppercase
import java.util.Scanner;

public class FirstLetterUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder();
        boolean cap = true;
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (cap && Character.isLetter(c)) {
                sb.append(Character.toUpperCase(c));
                cap = false;
            } else {
                sb.append(c);
                if (c == ' ' || c == '\t') cap = true;
            }
        }
        System.out.println(sb.toString());
    }
}
