package Observer;

/**
 * Created by dell on 2015/9/24.
 */
public class Customer implements Observer{

    private String name = null;

    public Customer(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "are eatting");
    }

    @Override
    public void doSomething() {
        eat();
    }
}
