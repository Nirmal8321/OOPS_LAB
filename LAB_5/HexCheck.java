// LAB_5 Q2 - Check if string is hexadecimal; user-defined exception
public class HexCheck {
    static class NotHexadecimalException extends Exception {
        NotHexadecimalException(String s) {
            super("Not a hexadecimal number: " + s);
        }
    }

    static boolean isHex(String s) {
        if (s == null || s.isEmpty()) return false;
        s = s.trim().toUpperCase();
        if (s.startsWith("0X")) s = s.substring(2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F')))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String num = "1A2F";
        try {
            if (!isHex(num))
                throw new NotHexadecimalException(num);
            System.out.println(num + " is a valid hexadecimal number.");
        } catch (NotHexadecimalException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ending the program");
        }
        num = "1G2F";
        try {
            if (!isHex(num))
                throw new NotHexadecimalException(num);
            System.out.println(num + " is valid.");
        } catch (NotHexadecimalException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ending the program");
        }
    }
}
