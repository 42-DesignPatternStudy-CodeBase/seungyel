package factoryPattern;

public class CarTest {
    public static void main(String[] args) {
        Car car;
        car = produceCar("Sonata");
        System.out.println(car);
        car = produceCar("Grandeur");
        System.out.println(car);
        car = produceCar("Genesis");
        System.out.println(car);
    }

    public static Car produceCar(String name) {
        SonataFactory sonataFactory = new SonataFactory();
        GrandeurFactory grandeurFactory = new GrandeurFactory();
        GenesisFactory genesisFactory = new GenesisFactory();

        Car car = null;
        if (name.equalsIgnoreCase("sonata")) {
            car = sonataFactory.orderCar();
        } else if (name.equalsIgnoreCase("grandeur")) {
            car = grandeurFactory.orderCar();
        } else if (name.equalsIgnoreCase("genesis")) {
            car = genesisFactory.orderCar();
        } else {
            System.out.print("noname");
        }
        return car;
    }
}
