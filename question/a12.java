//Design a Book class with title, author, and price. Create two book objects with different values.
public class a12 {
    String title;
    String author;
    double price;

    public static void main(String[] args) {
        a12 book1 = new a12();
        book1.title = "Java Programming";
        book1.author = "John Doe";
        book1.price = 29.99;

        a12 book2 = new a12();
        book2.title = "Python Basics";
        book2.author = "Jane Smith";
        book2.price = 34.99;

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: $" + book1.price);

        System.out.println("\nBook 2:");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: $" + book2.price);
    }
}