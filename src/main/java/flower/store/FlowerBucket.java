package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double total = 0;
        for (FlowerPack flowerPack : flowerPacks) {
            total += flowerPack.getPrice();
        }
        return total;
    }

    public List<Flower> allFlowers() {
        List<Flower> flowers = new ArrayList<Flower>();
        for (FlowerPack pack : flowerPacks) {
            flowers.add(pack.getFlower());
        }

        return flowers;
    }
}
