package ch14;

public class TakeTest {
    public static void main(String[] args) {
        Student studentJ = new Student("J", 5000);
        Student studentT = new Student("T", 10000);

        Bus bus1 = new Bus(100);
        Bus bus5 =  new Bus(500);

        studentJ.takeBus(bus1);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus1.showBusInfo();

        greenSubway.showInfo();
    }
}
