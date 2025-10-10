package flower.store;

public class Main {
    public static void main(String[] args) {

        Flower rose = new Flower();
        rose.setFlowerType(FlowerType.ROSE);
        rose.setPrice(100);

        Flower chamomile = new Flower();
        chamomile.setFlowerType(FlowerType.ROSE);
        chamomile.setPrice(1200);

        FlowerPack flowerPack = new FlowerPack();
        flowerPack.setFlower(chamomile);

    }
}
