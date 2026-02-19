/*
 * Q4: Create a class Date with month, day, year and a method DisplayDate.
 */
class Date {
    private final int month, day, year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Date d = new Date(7, 4, 2024);
        d.displayDate();
    }
}