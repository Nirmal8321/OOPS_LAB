import java.util.*;

class PerfectString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("Not Perfect String");
                return;
            }
            set.add(ch);
        }

        System.out.println("Perfect String");
    }
}
