package ch09;

public class SubjectTest {
    public static void main(String[] args) {
        // TODO: 2022/12/07 참조 변수 테스트
        Student stdLee = new Student(100 , "Lee");
        stdLee.setKorea("국어", 100);
        stdLee.setMath("수학", 80);

        stdLee.showScoreInfo();


        Student stdKim = new Student(101 , "Kim");
        stdKim.setKorea("국어", 50);
        stdKim.setMath("수학", 50);

        stdKim.showScoreInfo();
    }
}
