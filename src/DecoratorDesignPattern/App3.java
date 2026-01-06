package DecoratorDesignPattern;

public class App3 {
    public static void main(String[] args) {
        BasePizza finalPizza = new OlivesToppings(new CheeseToppings(new MarghritaPizza()));
        System.out.println(finalPizza.cost());
    }
}
// is-a and has-a relationship