package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2015/9/24.
 */
public class PizzaShop implements Subject{

    List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer customer){
        observerList.add(customer);
    }

    public void removeObserver(Observer customer){
        observerList.remove(customer);
    }

    public void notifyObserver(){
        System.out.println("pizza is ready!");
        for(Observer observer:observerList){
            observer.doSomething();
        }
    }

    public static void main(String[] args){
        PizzaShop shop = new PizzaShop();
        Customer c1 = new Customer("路人甲");
        shop.addObserver(c1);
        Customer c2 = new Customer("路人乙");
        shop.addObserver(c2);
        shop.notifyObserver();
        shop.removeObserver(c2);
        shop.notifyObserver();
    }
}
