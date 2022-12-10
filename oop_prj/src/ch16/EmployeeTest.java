package ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeL = new Employee();
        employeeL.setEmployeeName("Lee");


        Employee employeeK = new Employee();
        employeeK.setEmployeeName("Kim");

        // auto increment employeeID
        System.out.println(employeeL.getEmployeeId());
        System.out.println(employeeK.getEmployeeId());
    }
}
