package flowerstore.src.main.java.flower.store;

public enum FlowerColor {
    /**
     * Possible flower colors .
     */
    RED("#FF0000"), BLUE("#0000FF");
    /**
     * String color representation Variable .
     */
    private final String stringRepresentation;

    FlowerColor(final String stringRepresentation) {this.stringRepresentation = stringRepresentation;}

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
