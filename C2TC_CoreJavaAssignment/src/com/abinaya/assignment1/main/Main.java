package com.abinaya.assignment1.main;

import com.abinaya.assignment1.employees.Manager;
import com.abinaya.assignment1.employees.Developer;
import com.abinaya.assignment1.utilities.EmployeeUtilities;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Abinaya", 101, 75000, "HR");
        Developer d1 = new Developer("Nithiya", 102, 65000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(m1);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(d1);

        // Give raise
        System.out.println("\nGiving raise...");
        EmployeeUtilities.giveRaise(m1, 5000);
        EmployeeUtilities.giveRaise(d1, 4000);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.displayEmployeeDetails(m1);
        EmployeeUtilities.displayEmployeeDetails(d1);
    }
}
