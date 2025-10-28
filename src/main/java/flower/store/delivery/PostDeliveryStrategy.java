package flower.store.delivery;

import flower.store.order.Order;

public class PostDeliveryStrategy implements DeliveryStrategy {
    public int getDeliveryTimeDays() {
        return 12;
    }

    public void ship(Order order) {
        System.out.println("Order of price:" + order.getTotalPrice() + " will be shipped by post in "
                + getDeliveryTimeDays() + "days");
    }
}
