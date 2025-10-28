package flower.store.payment;

import flower.store.order.Order;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Order order) {
        System.out.println("Paid " + order.getTotalPrice() + " using PayPal");

    }
}
