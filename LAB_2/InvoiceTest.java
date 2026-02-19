/*
 * Q2: Create a class called Invoice with part number, description, quantity, and price.
 * Include a method getInvoiceAmount() and a test application.
 */
class Invoice {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }
    public int getQuantity() { return quantity; }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0.0) ? pricePerItem : 0.0;
    }
    public double getPricePerItem() { return pricePerItem; }

    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("101", "Wrench", 5, 12.50);
        System.out.println("Part: " + inv.getPartNumber() + " - " + inv.getPartDescription());
        System.out.printf("Invoice Amount: $%.2f%n", inv.getInvoiceAmount());
    }
}