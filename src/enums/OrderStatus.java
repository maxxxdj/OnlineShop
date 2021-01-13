package enums;

public enum OrderStatus {
    ACCEPTED("Accepted!"),
    PROCESSING("Processing..."),
    SHIPPING("Shipped!"),
    DELIVERED("Delivered!"),
    CANCELED("Canceled!");
    private String string;

    OrderStatus(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    @Override
    public String toString() {
        return String.format("Your order status is:%s", this.getString());
    }
}
