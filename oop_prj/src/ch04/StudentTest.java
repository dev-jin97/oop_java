package ch04;

public class StudentTest {

    public static void main(String[] args) {
        // TODO: 2022/12/07 OOP 가볍게 실습

        // Define Class studentLee이라는 인스턴스를 생성(참조 변수)
        Student studentLee = new Student();

        studentLee.setStudentId(10);
        studentLee.setStudentName("이용주");
        studentLee.setAddress("서울");

        studentLee.showStudentInfo();


        // studentKim 이라는 인스턴스 생성
        Student studentKim = new Student();

        studentKim.setStudentId(12);
        studentKim.setStudentName("김현진");
        studentKim.setAddress("신당");

        studentKim.showStudentInfo();


        /*
        *  각각 Heap 영역에서 다른 주소값을 가지게 됨. 즉, heap 영역에서의 각각 다른 영역에 위치.
        * */

        System.out.println(studentLee);
        System.out.println(studentKim);

    }
}
