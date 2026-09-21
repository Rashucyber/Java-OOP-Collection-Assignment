class TicketBooking {

    int seats = 5;

    synchronized void bookTicket(String name, int requiredSeats) {

        if (requiredSeats <= seats) {

            System.out.println(name + " booked " + requiredSeats + " seats");

            seats = seats - requiredSeats;

            System.out.println("Remaining seats: " + seats);
        }
        else {
            System.out.println(name + ": Seats Not Available");
        }
    }
}

class User extends Thread {

    TicketBooking booking;
    String name;
    int seats;

    User(TicketBooking booking, String name, int seats) {
        this.booking = booking;
        this.name = name;
        this.seats = seats;
    }

    public void run() {
        booking.bookTicket(name, seats);
    }
}

public class Main {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        User u1 = new User(booking, "User 1", 2);
        User u2 = new User(booking, "User 2", 2);
        User u3 = new User(booking, "User 3", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}