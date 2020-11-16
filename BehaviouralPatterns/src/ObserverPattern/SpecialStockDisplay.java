package ObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class SpecialStockDisplay implements Observer
{
    @Override
    public void update(Observable o, Object arg)
    {

        if((double)arg > 0.5)
        {
            System.out.println("Special Stock is "+ arg);
        }
    }
}
