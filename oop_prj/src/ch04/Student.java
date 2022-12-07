package ch04;

public class Student {
    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo(){
        System.out.println(studentId + "학번의 이름은 " + studentName + " 이고, 주소는 " + address + "입니다.");
    }


    // Getter
    public String getStudentName() {
        return studentName;
    }

    // Setter
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
