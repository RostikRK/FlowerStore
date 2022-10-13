package flowerstore.src.main.java.flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



@Setter
@AllArgsConstructor
public class Flower {
    public Flower() {

    }
    /**
     * sepal length Variable .
     */
    @Getter
    private double sepalLength;
    /**
     * color Variable .
     */
    private FlowerColor color;
    /**
     * price Variable .
     */
    @Getter
    @Setter
    private double price;
    /**
     * FlowerType Variable .
     */
    @Getter
    private FlowerType flowerType;


    /**
     * getter for string .
     */
    public String getColor() {
        return color.toString();
    }
}
