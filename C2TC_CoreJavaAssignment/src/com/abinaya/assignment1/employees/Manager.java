package com.abinaya.assignment1.employees;

public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary); // call parent constructor
        this.department = department;
    }

    // Getter
    public String getDepartment() {
        return department;
    }
}
