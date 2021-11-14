package lab6;

public class invoice implements payable{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String display() {
        return "Part Number: " + partNumber + "\nPart Description: " + partDescription + "\nQuantity: " + quantity + "\nPrice Per Item: " + pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}
