package flower.store.payment;

import flower.store.order.Order;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void pay(Order order) {
        System.out.println("Paid " + order.getTotalPrice() + " using credit card");
    }

}
