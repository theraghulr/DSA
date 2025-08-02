package Multilevel_Inheritance;

public class Main {
    public static void main(String[] args) {
        PersonalDetails[] employees = new PersonalDetails[1];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new PersonalDetails();
        }

        employees[0].setBasicDetails(101, "SoftwareEngineer");
        employees[0].setDetails(28,"Raghul");

        for (PersonalDetails emp : employees) {
            emp.display();
        }
    }
}
