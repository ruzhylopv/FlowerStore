package flower.store.delivery;

import flower.store.order.Order;

public interface DeliveryStrategy {
    int getDeliveryTimeDays();

    void ship(Order order);
}
