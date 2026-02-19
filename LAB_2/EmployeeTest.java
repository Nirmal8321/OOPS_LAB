/*
 * Q3: Create a class Employee with name, last name, and monthly salary.
 * Display yearly salary, give a 10% raise, and display yearly salary again.
 */
class Employee {
    private final String firstName;
    private final String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) this.monthlySalary = monthlySalary;
    }
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
    public void giveRaise() {
        monthlySalary = monthlySalary * 1.10;
    }
    public String getName() { return firstName + " " + lastName; }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Doe", 3000);
        Employee e2 = new Employee("Jane", "Smith", 4000);

        System.out.println(e1.getName() + " Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getName() + " Yearly Salary: " + e2.getYearlySalary());

        e1.giveRaise();
        e2.giveRaise();

        System.out.println("After 10% Raise:");
        System.out.println(e1.getName() + " Yearly Salary: " + e1.getYearlySalary());
        System.out.println(e2.getName() + " Yearly Salary: " + e2.getYearlySalary());
    }
}