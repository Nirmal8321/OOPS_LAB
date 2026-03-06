// LAB_5 Q6 - Student: Average (pass if avg>50), InputName
import java.util.Scanner;

class Student {
    String name;

    String inputName(String name) {
        this.name = name;
        return this.name;
    }

    boolean average(int m1, int m2, int m3) {
        double avg = (m1 + m2 + m3) / 3.0;
        return avg > 50;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter name: ");
        System.out.println("Name: " + s.inputName(sc.nextLine()));
        System.out.print("Enter 3 marks: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(s.average(a, b, c) ? "Passed" : "Failed");
        sc.close();
    }
}
