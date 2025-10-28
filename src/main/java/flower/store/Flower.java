package flower.store;

import flower.store.order.OrderItem;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Flower extends OrderItem {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public void setColor(FlowerColor color) {
        if (color == null) {
            throw new NullPointerException();
        }
        this.color = color;
    }

    public Flower(FlowerType type) {
        this.flowerType = type;
    }

    public String getColor() {
        if (color == null) {
            return null;
        }
        return color.toString();
    }

    public Flower(Flower other) {
        this.color = other.color;
        this.price = other.price;
        this.sepalLength = other.sepalLength;
        this.flowerType = other.flowerType;

    }

}
