package flowerstore.src.main.java.flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
public class FlowerBucket {
    @Getter
    @Setter
    private List<FlowerPack> bucket;

    public void add(FlowerPack flowerPack) {
        this.bucket.add(flowerPack);
    }

    public double getPrice() {
        double res = 0;
        for (FlowerPack pack : this.bucket) {
            res = res + pack.getPrice();
        }
        return res;
    }
}
