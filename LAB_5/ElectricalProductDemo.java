// LAB_5 Q3 - Product and ElectricalProduct
class Product {
    int productId;
    String name;
    int categoryId;
    double unitPrice;

    Product(int productId, String name, int categoryId, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.categoryId = categoryId;
        this.unitPrice = unitPrice;
    }
}

class ElectricalProduct extends Product {
    String voltageRange;
    double wattage;

    ElectricalProduct(int productId, String name, int categoryId, double unitPrice,
                      String voltageRange, double wattage) {
        super(productId, name, categoryId, unitPrice);
        this.voltageRange = voltageRange;
        this.wattage = wattage;
    }

    void setWattage(double wattage) { this.wattage = wattage; }
    void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    void display() {
        System.out.println("Product ID: " + productId + ", Name: " + name +
            ", Category ID: " + categoryId + ", Unit Price: " + unitPrice +
            ", Voltage Range: " + voltageRange + ", Wattage: " + wattage);
    }
}

public class ElectricalProductDemo {
    public static void main(String[] args) {
        ElectricalProduct ep = new ElectricalProduct(101, "LED Bulb", 1, 299.0, "220V", 9.0);
        ep.display();
        ep.setWattage(12.0);
        ep.setUnitPrice(349.0);
        System.out.println("Updated details:");
        ep.display();
    }
}
