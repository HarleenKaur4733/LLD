package BuilderDesignPattern;

public class Pizza {

    private String size;
    private boolean cheese;
    private boolean olives;
    private boolean mushrooms;
    private boolean extraCheese;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.olives = builder.olives;
        this.mushrooms = builder.mushrooms;
        this.extraCheese = builder.extraCheese;
    }

    public static class Builder {

        private String size;
        private boolean cheese;
        private boolean olives;
        private boolean mushrooms;
        private boolean extraCheese;

        // TODO:
        // Constructor for required field: size
        Builder(String size) {
            this.size = size;
        }

        // TODO:
        // Methods for optional fields.
        // Remember: each should return Builder
        Builder addCheese() {
            this.cheese = true;
            return this;
        }

        Builder addOlives() {
            this.olives = true;
            return this;
        }

        Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        Builder addExtraCheese() {
            this.extraCheese = true;
            return this;
        }

        // TODO:
        // build() method
        Pizza build() {
            return new Pizza(this);
        }
    }
}