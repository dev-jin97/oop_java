package ch06;

public class StudentTest {
    public static void main(String[] args) {
        // TODO: 2022/12/07 생성자 Test
        Student studentLee = new Student(); // default constructor

        System.out.println(studentLee.showStudentInfo());


        Student studentKim = new Student(10, "Kim", "3학년");

        System.out.println(studentKim.showStudentInfo());
    }
}
