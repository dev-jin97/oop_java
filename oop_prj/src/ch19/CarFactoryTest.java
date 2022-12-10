package ch19;

public class CarFactoryTest {
    public static void main(String[] args) {
        // TODO: 2022/12/10 Practice to singleton-pattern with static
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());
    }
}
