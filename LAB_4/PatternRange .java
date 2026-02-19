import java.util.Scanner;

class PatternRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String pattern = sc.next();

        int count = 0;

        for (int i = a; i <= b; i++) {
            if (String.valueOf(i).contains(pattern)) {
                count++;
            }
        }

        System.out.println("Pattern occurred: " + count + " times");
    }
}
