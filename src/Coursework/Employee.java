package Coursework;

public class Employee {

    public static int counter = 1;


    private final String surName, firstName, secondName;
    private int department;
    private double salary;


    public Employee(int counter, String surName, String firstName, String secondName, int department, double salary) {

        this.surName = surName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        counter++;
    }

    public static int id() {
        return counter;
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

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String  toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}

class Employees {
    public static void main(String[] args) {
        Employee[] abc = new Employee[10];
        abc[0] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 1, 30.000);
        abc[1] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 2, 30.000);
        abc[2] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 3, 30.000);
        abc[3] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 4, 30.000);
        abc[4] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 5, 30.000);
        abc[5] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 1, 30.000);
        abc[6] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 2, 30.000);
        abc[7] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 3, 30.000);
        abc[8] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 4, 30.000);
        abc[9] = new Employee(Employee.id(), "Иванов", "Иван", "Иваныч", 5, 30.000);
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }
}


//            void allEmployees() {}


//            void sumSalary () {}


//            void middleSalaryAllEmployees () {}


//            void minSalaryEmploy () {}


//            void maxSalaryEmploy () {}


//            void allFullNames () {}

//   