package AbstractFactory;

/**
 * Created by dell on 2015/9/24.
 */
public abstract class AbstractFactory {

    public static AbstractFactory getFactory(String type){
        if("milk".equals(type)){
            return new MilkFoodFactory();
        }else if ("jam".equals(type)){
            return new JamFoodFactory();
        }
        return null;
    }

    public abstract Pizza makePizza();
    public abstract Bread makeBread();


    /**
     * 产品族
     * @param args
     */
    public static void main(String[] args){
/*      AbstractFactory factory1 = new MilkPizzaFactory();
        factory1.makePizza().eat();
        factory1.makeBread().eat();
        AbstractFactory factory2 = new JamPizzaFactory();
        factory2.makePizza().eat();
        factory2.makeBread().eat();*/
        AbstractFactory factory3 = getFactory("jam");
        factory3.makePizza().eat();
        factory3.makeBread().eat();
    }
}
