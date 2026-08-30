package CodingExercises.PizzaOrderingSystem;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());

        pizza = new ExtraCheese(pizza);
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());

        pizza = new Mushrooms(pizza);
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());
    }
}
