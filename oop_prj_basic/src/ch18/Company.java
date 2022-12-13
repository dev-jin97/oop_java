package ch18;

public class Company {
    // TODO: 2022/12/10 make a singleton-pattern

    private static Company instance = new Company();

    private Company(){} // default constructor fail

    public static Company getInstance(){
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

}
