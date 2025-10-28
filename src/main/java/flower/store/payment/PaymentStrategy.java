package flower.store.payment;

import flower.store.order.Order;

public interface PaymentStrategy {
    void pay(Order order);
}
