package ch16;

public class Employee {
    // TODO: 2022/12/10 use a static

    private static int serialNumber = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNumber++;
        this.employeeId =  serialNumber;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
