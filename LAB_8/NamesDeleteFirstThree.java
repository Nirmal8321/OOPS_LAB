// LAB_8 Q3 - 10 names: delete first 3 chars, sort alphabetically
import java.util.Arrays;
import java.util.Scanner;

public class NamesDeleteFirstThree {
    public static void main(String[] args) {
        String[] names = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            String n = sc.nextLine();
            names[i] = n.length() > 3 ? n.substring(3) : "";
        }
        sc.close();
        Arrays.sort(names);
        System.out.println("After removing first 3 chars, sorted:");
        for (String s : names) System.out.println(s);
    }
}
