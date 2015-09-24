package AbstractFactory;


/**
 * Created by dell on 2015/9/24.
 */
public class MilkFoodFactory extends AbstractFactory {
    @Override
    public Pizza makePizza() {
        return new MilkPizz();
    }

    @Override
    public Bread makeBread() {
        return new MilkBread();
    }
}
