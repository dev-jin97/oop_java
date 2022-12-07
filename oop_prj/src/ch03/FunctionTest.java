package ch03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;



public class FunctionTest {
    public static int addNum(int a, int b) {
        // TODO: 2022/12/07 Int형으로 반환하는 함수
        return a + b;

    }

    public static void sayHello(String greeting) {
        // TODO: 2022/12/07 Void : 반환값이 없는 함수
        System.out.println(greeting);
    }

    public static int calcSum() {

        int res = 0;
        for (int i = 0; i <= 100; i++) {
            res += i;
        }
        return res;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int addNum_res = addNum(10, 20);
        System.out.println(addNum_res);

        int total = calcSum();
        System.out.println(total);
    }

}
