import java.util.ArrayList;

class Student {
    int roll;
    String name;
    String branch;
    double cgpa;

    Student(int roll, String name, String branch, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(roll + " " + name + " " + branch + " " + cgpa);
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Riya", "CSE", 8.5));
        list.add(new Student(102, "Aman", "CS", 7.5));
        list.add(new Student(103, "Neha", "IT", 9.0));
        list.add(new Student(104, "Rahul", "CSE", 8.2));
        list.add(new Student(105, "Ankit", "ECE", 7.8));

        System.out.println("All Students:");

        for (Student s : list) {
            s.display();
        }

        // Search
        int searchRoll = 103;

        for (Student s : list) {
            if (s.roll == searchRoll) {
                System.out.println("\nStudent Found:");
                s.display();
            }
        }

        // Remove
        int removeRoll = 102;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).roll == removeRoll) {
                list.remove(i);
                break;
            }
        }

        System.out.println("\nStudents with CGPA > 8:");

        for (Student s : list) {
            if (s.cgpa > 8.0) {
                s.display();
            }
        }
    }
}