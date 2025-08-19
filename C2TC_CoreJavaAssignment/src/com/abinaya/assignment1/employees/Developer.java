package com.abinaya.assignment1.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Getter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
