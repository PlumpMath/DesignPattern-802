package SimpleFactory;

/**
 * Created by dell on 2015/9/24.
 */
public class SimpleFactory {

    public static Pizza makePizz(String type){
        if("milk".equals(type)){
            return new MilkPizz();
        }else if("jam".equals(type)){
            return new JamPizz();
        }
        return null;
    }

    public static void main(String[] args){
        Pizza pizz1 = makePizz("jam");
        pizz1.eat();
        Pizza pizz2 = makePizz("milk");
        pizz2.eat();
    }
}
