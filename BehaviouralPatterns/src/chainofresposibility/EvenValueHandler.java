package chainofresposibility;

public class EvenValueHandler extends OurDataHandler
{
    public EvenValueHandler(OurDataHandler next)
    {
        super(next);
    }

    @Override
    protected boolean canHandleEvent(int value)
    {
        return value%2==0;
    }

    @Override
    protected void handleEvent(int value)
    {
        System.out.println("The value "+ value + " is Even");
    }

}
