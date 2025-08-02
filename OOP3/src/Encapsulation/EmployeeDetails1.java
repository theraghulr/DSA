package Encapsulation;

public class EmployeeDetails1 {

    private int employeeId;
    private String employeeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id) {
        this.employeeId = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void Display() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName);
    }
}

