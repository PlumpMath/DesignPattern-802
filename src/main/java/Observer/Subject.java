package Observer;

/**
 * Created by dell on 2015/9/24.
 */
public interface Subject {

    public void addObserver(Observer customer);

    public void removeObserver(Observer customer);

    public void notifyObserver();
}
