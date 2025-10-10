package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerBucket> buckets;

    public Store() {
        buckets = new ArrayList<FlowerBucket>();
    }

    public void addBucket(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public List<FlowerBucket> search(FlowerType type) {
        List<FlowerBucket> proposedBuckets = new ArrayList<FlowerBucket>();
        for (FlowerBucket bucket : buckets) {
            for (Flower flower : bucket.allFlowers()) {
                if (type == flower.getFlowerType()) {
                    proposedBuckets.add(bucket);
                }
            }
        }
        return proposedBuckets;
    }

    public List<FlowerBucket> search(FlowerType type, FlowerColor color) {
        List<FlowerBucket> proposedBuckets = new ArrayList<>();
        for (FlowerBucket bucket : buckets) {
            for (Flower flower : bucket.allFlowers()) {
                if (flower.getFlowerType() == type &&
                        flower.getColor().equals(color.toString())) {
                    proposedBuckets.add(bucket);
                    break;
                }
            }
        }
        return proposedBuckets;
    }

    public List<FlowerBucket> search(double minPrice, double maxPrice) {
        List<FlowerBucket> proposedBuckets = new ArrayList<>();
        for (FlowerBucket bucket : buckets) {
            for (Flower flower : bucket.allFlowers()) {
                double price = flower.getPrice();
                if (price >= minPrice && price <= maxPrice) {
                    proposedBuckets.add(bucket);
                    break;
                }
            }
        }
        return proposedBuckets;
    }
}
