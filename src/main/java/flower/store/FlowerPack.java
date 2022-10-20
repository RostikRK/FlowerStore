package flowerstore.src.main.java.flower.store;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack extends Item {
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

    public FlowerPack() { }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}
