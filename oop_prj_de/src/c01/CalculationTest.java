package c01;

public class CalculationTest {
    static class Calculation{
        int add(int x, int y){
            return x + y;
        }

        int subtract (int x, int y){
            return x - y;
        }
    }


    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.printf("100 + 90 = %d",calculation.add(100, 90));
    }
}
