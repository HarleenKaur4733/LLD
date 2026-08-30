package CodingExercises.PizzaOrderingSystem;

public class Mushrooms implements Pizza {

    private Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mushrooms";
    }

}
