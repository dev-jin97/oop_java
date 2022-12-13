package ch15;

public class Main {
    public static void main(String[] args) {
        Student studentE = new Student("Edwards", 20000);

        Taxi taxi = new Taxi("잘나간다  운수");

        studentE.takeTaxi(taxi, 10000);

        studentE.showInfo();
        taxi.showInfo();

    }
}
