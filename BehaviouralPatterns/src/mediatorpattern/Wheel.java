package mediatorpattern;

public class Wheel implements WheelInterface
{
    private Tire tire;

    private Hub hub;

    public Hub getHub()
    {
        return hub;
    }

    public void setHub(Hub hub)
    {
        this.hub = hub;
    }

    public Tire getTire()
    {
        return tire;
    }

    public void setTire(Tire tire)
    {
        this.tire = tire;
    }

    public boolean changeRadius(Tire tire, int radius)
    {
        if (hub != null && hub.getRadius() < radius)
        {
            tire.setRadius(radius);
            return true;
        }
        return false;
    }

    public boolean changeRadius(Hub hub, int radius)
    {
        if (tire != null && tire.getRadius() > radius)
        {
            hub.setRadius(radius);
            return true;
        }
        return false;
    }

    @Override
    public void setComponent(WheelComponent wheelComponent)
    {
        if (wheelComponent instanceof Tire)
        {
            setTire((Tire) wheelComponent);
        }
        if (wheelComponent instanceof Hub)
        {
            setHub((Hub) wheelComponent);
        }
    }

    @Override
    public boolean set(WheelComponent wheelComponent, int newRadius)
    {
        if (wheelComponent instanceof Tire)
        {
            return changeRadius((Tire) wheelComponent, newRadius);
        }
        if (wheelComponent instanceof Hub)
        {
            return changeRadius((Hub) wheelComponent, newRadius);
        }

        return false;

    }
}
