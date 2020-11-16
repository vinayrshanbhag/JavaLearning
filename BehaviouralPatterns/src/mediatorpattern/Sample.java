package mediatorpattern;

public class Sample
{

    public static void main(String[] args)
    {
        WheelInterface wheel = new Wheel();
        Tire tire = new Tire(wheel);


        Hub hub = new Hub(wheel);
        hub.setRadius(20);

        tire.changeRadius(21);
        hub.changeRadius(19);

        System.out.println(tire);
        System.out.println(hub);
    }

}
