class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println();
    }
}

class Developer extends Employee {
    double projectAllowance;

    Developer(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        projectAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + projectAllowance;
    }
}

class Manager extends Employee {
    double managementAllowance;

    Manager(int id, String name, double basicSalary, double allowance) {
        super(id, name, basicSalary);
        managementAllowance = allowance;
    }

    double calculateSalary() {
        return basicSalary + managementAllowance;
    }
}

class Intern extends Employee {
    double stipend;

    Intern(int id, String name, double basicSalary, double stipend) {
        super(id, name, basicSalary);
        this.stipend = stipend;
    }

    double calculateSalary() {
        return basicSalary + stipend;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e;

        e = new Developer(101, "Rahul", 30000, 5000);
        e.display();

        e = new Manager(102, "Aman", 40000, 10000);
        e.display();

        e = new Intern(103, "Riya", 15000, 5000);
        e.display();
    }
}