package BuilderDesignPattern;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Small").addCheese().addOlives().build();

    }
}
