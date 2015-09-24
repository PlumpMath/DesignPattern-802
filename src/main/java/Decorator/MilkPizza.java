package Decorator;

/**
 * Created by dell on 2015/9/24.
 */
public class MilkPizza extends Pizza {

    public MilkPizza(Pizza pizza){
        System.out.println("make milk");
        price = 2;
        this.pizza = pizza;
    }

}
