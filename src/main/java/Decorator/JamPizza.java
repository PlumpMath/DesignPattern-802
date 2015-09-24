package Decorator;

/**
 * Created by dell on 2015/9/24.
 */
public class JamPizza extends Pizza {

    public JamPizza(Pizza pizza){
        System.out.println("make jam");
        price = 3;
        this.pizza = pizza;
    }
}
