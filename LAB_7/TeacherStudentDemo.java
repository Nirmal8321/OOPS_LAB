// LAB_7 Q4 - Student extends Teacher (only additional members in Student)
class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    void display() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

class Student extends Teacher {
    int rollNo;
    String branch;
    Student(String name, String subject, int rollNo, String branch) {
        super(name, subject);
        this.rollNo = rollNo;
        this.branch = branch;
    }
    void displayStudent() {
        display();
        System.out.println("Roll: " + rollNo + ", Branch: " + branch);
    }
}

public class TeacherStudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Dr. Smith", "Math", 101, "CSE");
        s.displayStudent();
    }
}
