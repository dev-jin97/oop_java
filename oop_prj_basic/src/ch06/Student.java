package ch06;

import jdk.nashorn.internal.objects.annotations.Getter;


public class Student {
    public int studentId;
    public String studentName;
    public String grade;

    //=======================================================//

    public Student() {} // 기본 생성자

    public Student(int studentId, String studentName, String grade){
        // TODO: 2022/12/07 생성할 때 member var 선언

        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    /*기본 생성자를 구현하지 않고 생성자 커스텀을 했다고 치면 기본 생성자를 사용하지 못함. 즉, 제어를 할 수 있다.*/




    //=======================================================//

    public String showStudentInfo(){
        return studentName + " 학생의 학번은 " + studentId + "이고, 학년은 " + grade + "이다.";
    }
}
