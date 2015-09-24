package FactoryMethod;

/**
 * Created by dell on 2015/9/24.
 */
public class MilkPizzaFactory extends AbstractFactory {
    @Override
    public Pizza makePizza() {
        return new MilkPizz();
    }
}
