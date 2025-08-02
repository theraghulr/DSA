package Encapsulation;

public class EmployeeDetails {

    private  int employeeId;
    private String employeeName;
//    private int EmployeeAge;
//    private String EmployeeAge;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int id){
        this.employeeId = id;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String name){
        this.employeeName = name;
    }

    void Display(){
        System.out.println("ID"+ employeeId + "Name:"+ employeeName);
    }
}
