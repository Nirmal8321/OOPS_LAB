import java.util.Scanner;
class bulbcheck{
    boolean checkbulb(boolean isDefectivelagment) {
        if (isDefectivelagment) {
            throw new IllegalArgumentException("Bulb has defective lgament");
        }
        return true;
    }
} 

public class q1 {
    public static void main(String[] args) {
        bulbcheck bc = new bulbcheck();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter True or 1 if the bulb is defective Lgament otherwise enter False or 0:");
        boolean test = sc.nextBoolean(); 
        try {
            boolean result = bc.checkbulb(test);
            System.out.println("Bulb is alright: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
// Bulb With Lgament defective then throw error if not then print it is alright