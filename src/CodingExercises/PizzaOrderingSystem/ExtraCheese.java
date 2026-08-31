package CodingExercises.PizzaOrderingSystem;

public class ExtraCheese implements Pizza {
    // has a
    private Pizza pizza;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Extra Cheese";
    }
}