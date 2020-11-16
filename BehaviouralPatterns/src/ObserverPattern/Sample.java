package ObserverPattern;

public class Sample
{
    public static void main(String[] args)
    {
        Stock stock  = new Stock();

        DisplayStock display = new DisplayStock();
        SpecialStockDisplay specialStockDisplay = new SpecialStockDisplay();

        stock.addObserver(display);
        stock.addObserver(specialStockDisplay);

        stock.start();
    }




}
