package flowerstore.src.test.java.flower.store;

import flowerstore.src.main.java.flower.store.Flower;
import flowerstore.src.main.java.flower.store.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FlowerTest {
    /**
     * Flower Variable .
     */
    private Flower flower;

    /**
     * init test.
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }
    /**
     * price test.
     */
    @Test
    public void testPrice() {
        final int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    /**
     * color test.
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        assertEquals("#FF0000", flower.getColor());
    }
}
