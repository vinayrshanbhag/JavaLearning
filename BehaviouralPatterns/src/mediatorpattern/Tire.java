package mediatorpattern;

public class Tire implements WheelComponent
{
    private int radius;
    private WheelInterface wheelInterface;

    public WheelInterface getWheelInterface()
    {
        return wheelInterface;
    }



    public Tire(WheelInterface wheel)
    {
        this.wheelInterface = wheel;
        this.wheelInterface.setComponent(this);
}

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public boolean changeRadius(int radius)
    {
        return getWheelInterface().set(this, radius);

    }



    @Override
    public String toString()
    {
        return "Tire{" + "radius=" + radius + '}';
    }
}
