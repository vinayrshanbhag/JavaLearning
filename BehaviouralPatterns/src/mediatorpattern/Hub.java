package mediatorpattern;


public class Hub implements WheelComponent
{
    WheelInterface wheelInterface;

    private int radius;

    public Hub(WheelInterface wheelInterface)
    {
        this.wheelInterface = wheelInterface;
        this.wheelInterface.setComponent(this);
    }

    public void setRadius(int i)
    {
        radius = i;
    }

    public int getRadius()
    {
        return radius;
    }

    @Override
    public String toString()
    {
        return "Hub{" + "radius=" + radius + '}';
    }

    public boolean changeRadius(int newRadius)
    {
        return this.wheelInterface.set(this, newRadius);
    }
}
