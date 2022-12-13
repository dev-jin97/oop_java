package ch19;

public class CarFactory {
    // TODO: 2022/12/10 Create to singleton-pattern
    private static CarFactory instance = new CarFactory();
    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }
    public Car createCar(){
        return new Car();
    }
}
