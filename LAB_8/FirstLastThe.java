// LAB_8 Q1 - First and last "the", copy between to another string
import java.util.Scanner;

public class FirstLastThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = sc.nextLine();
        sc.close();
        int first = line.toLowerCase().indexOf("the");
        int last = line.toLowerCase().lastIndexOf("the");
        if (first == -1 || last == -1 || first == last) {
            System.out.println("'the' not found twice.");
            return;
        }
        String between = line.substring(first, last + 3);
        System.out.println("Between first and last 'the': " + between);
    }
}
