package flowerstore.src.main.java.flower.store;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack {
    /**
     * Flower Variable .
     */
    @Getter
    private Flower flower;
    /**
     * int Quantity Variable.
     */
    @Getter
    @Setter
    private int quantity;

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}
