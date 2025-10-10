package flower.store;

import lombok.Data;

@Data
public class FlowerPack {

    private Flower flower;
    private int quantity;

    public void setFlower(Flower flower) {
        this.flower = new Flower(flower);
    }

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
