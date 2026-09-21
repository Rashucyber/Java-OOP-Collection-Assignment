import java.util.*;

class Patient {
    int id;
    String name;
    int priority;

    Patient(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Patient> queue =
            new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));

        queue.add(new Patient(101, "Rahul", 3));
        queue.add(new Patient(102, "Riya", 1));
        queue.add(new Patient(103, "Aman", 2));
        queue.add(new Patient(104, "Neha", 1));

        System.out.println("Treatment Order:");

        while (!queue.isEmpty()) {

            Patient p = queue.poll();

            System.out.println(
                "ID: " + p.id +
                ", Name: " + p.name +
                ", Priority: " + p.priority
            );
        }
    }
}