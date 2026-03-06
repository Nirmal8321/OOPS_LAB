// LAB_5 Q4 - Fruit class, 2 objects, displayFruit()
class Fruit {
    String name;
    String type; // "Single" or "Bunch"
    double price;

    Fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void displayFruit() {
        System.out.println("Name: " + name + ", Type: " + type + ", Price: " + price);
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple", "Single", 50.0);
        Fruit f2 = new Fruit("Banana", "Bunch", 30.0);
        f1.displayFruit();
        f2.displayFruit();
    }
}
