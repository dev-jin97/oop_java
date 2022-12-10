package ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();


        // JVM에 할당해준 힙메모리의 영역이 같음.
        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance(); // 유일한 객체 제공

    }
}
