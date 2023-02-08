package Coursework;

public class Employee {
    private final String surName, firstName, secondName;
    private int department, salary;
    private static int id = 0;

    public Employee(String surName, String firstName, String secondName, int department, int salary) {
        this.surName = surName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        id++;
    }



    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int countId() {
        return id;
    }

    }
