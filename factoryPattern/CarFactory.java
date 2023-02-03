package factoryPattern;

public interface CarFactory {
    default Car orderCar() {
        Car car = createCar();
        return car;
    }
    Car createCar();
}

class SonataFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sonata();
    }
}

class GrandeurFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Grandeur();
    }
}

class GenesisFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Genesis();
    }
}