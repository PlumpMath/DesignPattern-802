package Decorator;

/**
 * Created by dell on 2015/9/24.
 */
public class Pizza {

    public int price = 10;

    public Pizza pizza = null;

    public Pizza(){
        System.out.println("make pizza");
    }
    public int getPrice(){
        int totalPrice = 0;
        if(pizza!=null){
            totalPrice = pizza.getPrice() + price;
        }else{
            totalPrice = price;
        }
        System.out.println("this price is "+ totalPrice);
        return totalPrice;
    }

    public void printPrice(){
        System.out.println("--------"+price);
    }

    public static void main(String[] args){
        Pizza pizza = new Pizza();pizza.printPrice();
        pizza.getPrice();
        pizza = new MilkPizza(pizza);pizza.printPrice();
        pizza.getPrice();
        pizza = new JamPizza(pizza);pizza.printPrice();
        pizza.getPrice();
    }
}
