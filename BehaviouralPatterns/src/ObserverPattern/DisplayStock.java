package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class DisplayStock implements Observer
{

    @Override
    public void update(Observable observable, Object data)
    {
        System.out.println("Stock Value" + data);
    }
}
