package flower.store;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class FlowerPack {

    private Flower flower;
    private int quantity;

    public void setFlower(Flower flower) {
        this.flower = new Flower(flower);
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
