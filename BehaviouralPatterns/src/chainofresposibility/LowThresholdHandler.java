package chainofresposibility;

public class LowThresholdHandler extends OurDataHandler
{
    private final int threshold;

    public LowThresholdHandler(int threshold)
    {
        this.threshold = threshold;
    }

    public LowThresholdHandler(int threshold, OurDataHandler next)
    {
        super(next);
        this.threshold = threshold;
    }

    @Override
    protected boolean canHandleEvent(int value)
    {
        return value < threshold;
    }

    public void handleEvent(int value)
    {
        System.out.println("The value " + value + " is less than Threshold " + threshold);
    }
}
