package FactoryMethod;

/**
 * Created by dell on 2015/9/24.
 */
public class JamPizzaFactory extends AbstractFactory {
    @Override
    public Pizza makePizza() {
        return new JamPizz();
    }
}
