package FactoryMethod;

/**
 * Created by dell on 2015/9/24.
 */
public abstract class AbstractFactory {

    /*public static AbstractFactory getPizzaFactory(String type){

    }*/

    public abstract Pizza makePizza();


    /**
     * 产品等级
     */
    public static void main(String[] args){
        Pizza pizz1 = new MilkPizzaFactory().makePizza();
        pizz1.eat();
        Pizza pizz2 = new JamPizzaFactory().makePizza();
        pizz2.eat();
    }
}
