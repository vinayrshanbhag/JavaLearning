package chainofresposibility;

import java.util.Optional;

public abstract class OurDataHandler
{
    private Optional<OurDataHandler> next = Optional.empty();

    public OurDataHandler()
    {
    }

    public OurDataHandler(OurDataHandler next)
    {
        this.next = Optional.of(next);
    }

    public final void handle(int value)
    {
        if (canHandleEvent(value))
        {
           handleEvent(value);
        }
        else
        {
            next.ifPresent(nextHandler -> nextHandler.handle(value));

        }

    }

    protected abstract boolean canHandleEvent(int value);
    protected abstract void handleEvent(int value);
}
