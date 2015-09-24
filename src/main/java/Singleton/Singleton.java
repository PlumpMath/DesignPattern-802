package Singleton;

/**
 * Created by dell on 2015/9/24.
 */
public class Singleton {

    private static Singleton obj = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if (obj == null){
            synchronized (Singleton.class){
                if(obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
