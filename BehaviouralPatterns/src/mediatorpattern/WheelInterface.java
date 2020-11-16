package mediatorpattern;

public interface WheelInterface
{
    void setComponent(WheelComponent hub);

    boolean set(WheelComponent wheelComponent, int newRadius);
}
