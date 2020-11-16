package chainofresposibility;

import java.util.Random;

public class OurDataSource
{
    OurDataHandler listener;
    public void start()
    {

        while(true){
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            Random random = new Random();
            int value = random.nextInt(1000);
            listener.handle(value);
        }

    }

    public void addListener(OurDataHandler ourDataHandler)
    {
        listener = ourDataHandler;

    }
}
