package AbstractFactory;

/**
 * Created by dell on 2015/9/24.
 */
public class JamFoodFactory extends AbstractFactory {
    @Override
    public Pizza makePizza() {
        return new JamPizz();
    }

    @Override
    public Bread makeBread() {
        return new JamBread();
    }
}
