package CodingExercises.PizzaOrderingSystem;

public class BasicPizza implements Pizza {

    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Base Pizza";
    }
}
