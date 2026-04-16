
import java.util.Scanner;

class RS{
    static boolean stringreverse(String h){
        boolean a=false;
        String b = new StringBuilder(h).reverse().toString();
        
        if(b.equals(h)){
            a = true;
        }
        return a;
    }
};

class q3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String h = sc.nextLine();
        boolean a =RS.stringreverse(h);
        System.out.println(a);
        sc.close();
    }
}