package flower.store.order;

public abstract class OrderItem {
    private double price;

    public OrderItem(double price) {
        this.price = price;
    }

    public OrderItem() {

    }

    public double getPrice() {
        return price;
    }

}
