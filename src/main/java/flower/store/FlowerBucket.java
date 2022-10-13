package flowerstore.src.main.java.flower.store;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
public class FlowerBucket {
    @Getter
    @Setter
    private ArrayList<FlowerPack> bucket;

    public FlowerBucket() {
        this.bucket = new ArrayList<FlowerPack>();
    }

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
