package DecoratorDesignPattern;

// is-a
public abstract class ToppingDecorator extends BasePizza {
    // has-a
    protected final BasePizza basePizza;

    ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
