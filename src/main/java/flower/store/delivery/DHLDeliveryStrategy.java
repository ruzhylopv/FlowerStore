package flower.store.delivery;

import flower.store.order.Order;

public class DHLDeliveryStrategy implements DeliveryStrategy {
    public int getDeliveryTimeDays() {
        return 7;
    }

    public void ship(Order order) {
        System.out.println("Order of price:" + order.getTotalPrice() + "will be shipped by DHL service in "
                + getDeliveryTimeDays() + "days");
    }

}
