package flower.store.order;

import java.util.List;

import flower.store.payment.PaymentStrategy;

import java.util.ArrayList;

public class Order {
    private boolean paid;
    private PaymentStrategy paymentStrategy;

    private List<OrderItem> items = new ArrayList<>();

    public void pay() {
        if (!isPaid()) {
            paid = true;
            paymentStrategy.pay(this);
        }
    };

    public boolean isPaid() {
        return paid;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(item -> item.getPrice())
                .sum();
    }
}