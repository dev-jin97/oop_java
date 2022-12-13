package ch09;

public class Student {
    // TODO: 2022/12/07 학생
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;

        System.out.println(studentName + "님의 총점은 " + total + "점 입니다.");
    }
}
