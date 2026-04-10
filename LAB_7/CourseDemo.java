// LAB_7 Q6 - Course: ID, Description, Duration, Fees; array of 5, GetData()
class Course {
    int id;
    String description;
    int duration; // e.g. hours
    double fees;

    Course(int id, String description, int duration, double fees) {
        this.id = id;
        this.description = description;
        this.duration = duration;
        this.fees = fees;
    }

    void GetData() {
        System.out.println("ID: " + id + ", Description: " + description +
            ", Duration: " + duration + " hrs, Fees: " + fees);
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        Course[] courses = {
            new Course(1, "Java", 40, 5000),
            new Course(2, "Python", 30, 4000),
            new Course(3, "DBMS", 25, 3500),
            new Course(4, "OOP", 35, 4500),
            new Course(5, "DSA", 50, 6000)
        };
        for (Course c : courses) c.GetData();
    }
}
