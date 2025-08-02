package Constructor;

public class EmployeeDetails {
    int employeeId;
    String employeeName;
    int employeeAge;
    String employeeDesignation;


    EmployeeDetails(int employeeId, String employeeName, int employeeAge, String employeeDesignation){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeDesignation = employeeDesignation;
    }

    void Display(){
        System.out.println("My EmployeeId is "+ employeeId + "I'm "+ employeeName+ "my age is "+ employeeAge+"My desginated role is"+ employeeDesignation);
    }
}
