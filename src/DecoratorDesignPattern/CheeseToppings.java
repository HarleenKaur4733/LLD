package DecoratorDesignPattern;

public class CheeseToppings extends ToppingDecorator {

    CheeseToppings(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return 50 + basePizza.cost();
    }

}
