package DecoratorDesignPattern;

public class OlivesToppings extends ToppingDecorator {

    OlivesToppings(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return 34 + basePizza.cost();
    }

}
