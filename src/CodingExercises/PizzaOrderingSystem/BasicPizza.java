package CodingExercises.PizzaOrderingSystem;

public class BasicPizza implements Pizza {
    // is a
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Base Pizza";
    }
}
