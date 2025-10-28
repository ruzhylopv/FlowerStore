package flower.store.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.FlowerType;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }

    @GetMapping("/demo")
    public List<String> getDemoData() {
        return List.of("Hello", "Spring", "Boot");
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(
                new Flower(FlowerType.ROSE),
                new Flower(FlowerType.TULIP),
                new Flower(FlowerType.CHAMOMILE));

    }
}
