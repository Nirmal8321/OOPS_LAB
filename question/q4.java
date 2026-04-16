import java.util.Scanner;

class ConvertFristLetterToUpperCase{
    public static String convert(String str){
        StringBuilder s = new StringBuilder(str);
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i-1)==' '){
                s.setCharAt(i,Character.toUpperCase(s.charAt(i)));
            }
        }
        return s.toString();
    }
}

public class q4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println(ConvertFristLetterToUpperCase.convert(str));
        sc.close();
    }
}
