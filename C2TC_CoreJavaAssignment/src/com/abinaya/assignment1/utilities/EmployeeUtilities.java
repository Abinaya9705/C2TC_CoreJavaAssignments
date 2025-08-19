package com.abinaya.assignment1.utilities;

import com.abinaya.assignment1.employees.Employee;
import com.abinaya.assignment1.employees.Manager;
import com.abinaya.assignment1.employees.Developer;

public class EmployeeUtilities {

    // Display details of any Employee
    public static void displayEmployeeDetails(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());

        if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Department: " + m.getDepartment());
        } else if (e instanceof Developer) {
            Developer d = (Developer) e;
            System.out.println("Programming Language: " + d.getProgrammingLanguage());
        }
    }

    // Give raise
    public static void giveRaise(Employee e, double amount) {
        e.setSalary(e.getSalary() + amount);
    }
}
