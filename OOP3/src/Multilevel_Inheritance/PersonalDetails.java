package Multilevel_Inheritance;

public class PersonalDetails extends BasicDetails {
    String employeeName;
    int employeeAge;

    public void setDetails(int employeeAge,String employeeName) {
        this.employeeAge = employeeAge;
        this.employeeName=employeeName;
    }

    public void getDetails(){
        System.out.println(employeeAge);
        System.out.println(employeeName);
    }

    public void display(){
        getBasicDetails();
        getDetails();
    }
}
