package chainofresposibility;

public class AboveThresholdHandler extends OurDataHandler
{
    private final int threshold;

    public AboveThresholdHandler(int i)
    {
        threshold = i;
    }

    public AboveThresholdHandler(int i, OurDataHandler next)
    {

        super(next);
        threshold = i;
    }

    @Override
    protected boolean canHandleEvent(int value)
    {
        return value > threshold;
    }

    public void handleEvent(int value)
    {
        System.out.println("The value " + value + " exceeded Threshold " + threshold);

    }
}
