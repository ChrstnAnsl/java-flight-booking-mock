import java.util.Scanner;

public class FlightBookingApp {
    public static void main(String[] args) {
        System.out.println("Flight Booking Automation");
        BookingManager bookingManager = new BookingManager();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nOptions:");
                System.out.println("1. Book a flight");
                System.out.println("2. View bookings");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");

                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        bookingManager.bookFlight();
                        break;
                    case 2:
                        bookingManager.viewBookings();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
