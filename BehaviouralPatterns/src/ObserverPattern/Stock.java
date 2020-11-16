package ObserverPattern;

import java.util.Observable;

public class Stock extends Observable
{

    public void start()
    {
        Thread th = new Thread(()-> generateAPrice());
        th.start();
    }

    private void generateAPrice()
    {
        while(true)
        {
            sleep(1000);
            double value = Math.random();
            notifyObservers(value);
            setChanged();
        }
    }

    private void sleep(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
