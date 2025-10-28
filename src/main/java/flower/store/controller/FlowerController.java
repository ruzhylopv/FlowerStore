package flower.store.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flower.store.Flower;
import flower.store.FlowerType;

@RequestMapping("/flowers")
@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
                new Flower(FlowerType.ROSE),
                new Flower(FlowerType.TULIP),
                new Flower(FlowerType.CHAMOMILE));

    }
}
