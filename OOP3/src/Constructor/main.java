package Constructor;

public class main {
    public static void main(String[] args) {
        EmployeeDetails[] employees = new EmployeeDetails[3];

        employees[0] = new EmployeeDetails(1,"Raghul",22,"Developer");
        employees[1] = new EmployeeDetails(2,"Sanjay",22,"Developer");
        employees[2] = new EmployeeDetails(3,"Rajnish",22,"Developer");

        for(int i =0; i< employees.length; i++){
            employees[i].Display();
        }
    }
}
