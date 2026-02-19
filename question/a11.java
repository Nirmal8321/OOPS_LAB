//Create a Student class with attributes: name and rollNumber. Create an object and print its details.
public class a11 {
    String name;
    int rollNumber;

    public static void main(String[] args) {
        a11 student = new a11();
        student.name = "John";
        student.rollNumber = 123;
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
    }
}