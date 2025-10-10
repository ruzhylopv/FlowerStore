package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreSearchTest {

    private Store store;
    private Flower redRose;
    private Flower yellowTulip;
    private Flower whiteChamomile;
    private FlowerBucket roseBucket;
    private FlowerBucket tulipBucket;
    private FlowerBucket chamomileBucket;

    @BeforeEach
    void setUp() {
        store = new Store();

        // --- Create flowers ---
        redRose = new Flower(FlowerType.ROSE);
        redRose.setColor(FlowerColor.RED);
        redRose.setPrice(15.0);
        redRose.setSepalLength(10.0);

        yellowTulip = new Flower(FlowerType.TULIP);
        yellowTulip.setColor(FlowerColor.YELLOW);
        yellowTulip.setPrice(12.0);
        yellowTulip.setSepalLength(8.0);

        whiteChamomile = new Flower(FlowerType.CHAMOMILE);
        whiteChamomile.setColor(FlowerColor.WHITE);
        whiteChamomile.setPrice(7.5);
        whiteChamomile.setSepalLength(6.0);

        roseBucket = new FlowerBucket();
        roseBucket.addFlowerPack(new FlowerPack(redRose, 3));

        tulipBucket = new FlowerBucket();
        tulipBucket.addFlowerPack(new FlowerPack(yellowTulip, 5));

        chamomileBucket = new FlowerBucket();
        chamomileBucket.addFlowerPack(new FlowerPack(whiteChamomile, 10));

        // Add buckets to store
        store.addBucket(roseBucket);
        store.addBucket(tulipBucket);
        store.addBucket(chamomileBucket);
    }

    // --- search(FlowerType) ---
    @Test
    void testSearchByType() {
        List<FlowerBucket> found = store.search(FlowerType.ROSE);
        assertEquals(1, found.size());
        assertTrue(found.contains(roseBucket));
    }

    @Test
    void testSearchByPriceRange() {
        List<FlowerBucket> found = store.search(10.0, 15.0);
        assertEquals(2, found.size());
        assertTrue(found.contains(roseBucket));
        assertTrue(found.contains(tulipBucket));
    }

    @Test
    void testSearchByPriceRangeNoMatch() {
        List<FlowerBucket> found = store.search(100, 200);
        assertTrue(found.isEmpty());
    }

    @Test
    void testSearchByTypeAndColor() {
        List<FlowerBucket> found = store.search(FlowerType.ROSE, FlowerColor.RED);
        assertEquals(1, found.size());
        assertTrue(found.contains(roseBucket));
    }

    @Test
    void testSearchByTypeAndColorNoMatch() {
        List<FlowerBucket> found = store.search(FlowerType.ROSE, FlowerColor.WHITE);
        assertTrue(found.isEmpty());
    }

}
