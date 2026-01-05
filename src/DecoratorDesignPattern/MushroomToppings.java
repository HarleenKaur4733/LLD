package DecoratorDesignPattern;

public class MushroomToppings extends ToppingDecorator {

    MushroomToppings(BasePizza basePizza) {
        super(basePizza);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int cost() {
        return 12 + basePizza.cost();
    }

}
