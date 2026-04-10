// LAB_7 Q3 - Book, Periodical; modify price and period
class Book {
    int bookId;
    String title;
    String author;
    double price;
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

class Periodical extends Book {
    String period; // weekly, monthly, etc.
    Periodical(int bookId, String title, String author, double price, String period) {
        super(bookId, title, author, price);
        this.period = period;
    }
    void setPrice(double price) { this.price = price; }
    void setPeriod(String period) { this.period = period; }
    void display() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author +
            ", Price: " + price + ", Period: " + period);
    }
}

public class PeriodicalDemo {
    public static void main(String[] args) {
        Periodical p = new Periodical(1, "Tech Weekly", "John", 99.0, "weekly");
        p.display();
        p.setPrice(120.0);
        p.setPeriod("monthly");
        System.out.println("Updated:");
        p.display();
    }
}
