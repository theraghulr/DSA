package Multilevel_Inheritance;

public class BasicDetails {
    int employeeId;
    String employeeDesigantion;

    public void setBasicDetails(int employeeId, String employeeDesigantion){
        this.employeeId = employeeId;
        this.employeeDesigantion = employeeDesigantion;
    }

    public void getBasicDetails(){
        System.out.println(employeeId);
        System.out.println(employeeDesigantion);
    }
}
