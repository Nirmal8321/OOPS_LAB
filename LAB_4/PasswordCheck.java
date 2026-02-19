import java.util.Scanner;

class PasswordCheck {

    static boolean isValid(String pass) {

        if (pass.length() < 5 || pass.length() > 12)
            return false;

        boolean hasLower = false, hasDigit = false;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isUpperCase(ch) || !Character.isLetterOrDigit(ch))
                return false;

            if (Character.isLowerCase(ch))
                hasLower = true;

            if (Character.isDigit(ch))
                hasDigit = true;

            if (i < pass.length() - 1) {
                if (pass.substring(i, i+2).equals(pass.substring(i+2, Math.min(i+4, pass.length()))))
                    return false;
            }
        }

        return hasLower && hasDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        if (isValid(pass))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
            sc.close();
    }
}
