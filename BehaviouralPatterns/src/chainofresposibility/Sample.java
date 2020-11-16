package chainofresposibility;

public class Sample
{
    public static void main(String[] args)
    {
        OurDataSource ourDataSource = new OurDataSource();
        OurDataHandler aboveThresholdHandler = new AboveThresholdHandler(100);
        OurDataHandler evenValueHandler = new EvenValueHandler(aboveThresholdHandler);
        OurDataHandler lowThresholdHandler = new LowThresholdHandler(100, evenValueHandler);

        ourDataSource.addListener(lowThresholdHandler);
        ourDataSource.start();

    }
}

