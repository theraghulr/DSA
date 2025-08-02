package Encapsulation;

import Constructor.EmployeeDetails;

public class Main {

    public static void main(String[] args) {

        EmployeeDetails1[] employee = new EmployeeDetails1[]{
                new EmployeeDetails1(),
                new EmployeeDetails1()
        };



        employee[0].setEmployeeId(1);
        employee[0].setEmployeeName("Raghul");

        employee[1].setEmployeeId(2);
        employee[1].setEmployeeName("sanjay");

        for(int i=0;i< employee.length;i++){
            employee[i].Display();
        }

    }
}
