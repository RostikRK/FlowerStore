package flowerstore.src.test.java.flower.store;

import flowerstore.src.main.java.flower.store.Flower;
import flowerstore.src.main.java.flower.store.FlowerColor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class FlowerTest {
    /**
     * integer Variable I
     */
    private Flower flower;

    /**
     * init test
     */
    @BeforeEach
    public void init() {
        flower = new Flower();
    }
    /**
     * price test
     */
    @Test
    public void testPrice() {
        final int PRICE_CONS = 20;
        flower.setPrice(PRICE_CONS);
        assertEquals(PRICE_CONS, flower.getPrice());
    }

    /**
     * color test
     */
    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        assertEquals("#FF0000", flower.getColor());
    }
}
