import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class BookingManager {
    private List<Booking> bookings = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void bookFlight() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");

            System.out.print("Date From (M/d/yyyy): ");
            Date dateFrom = dateFormat.parse(scanner.nextLine());

            System.out.print("Date To (M/d/yyyy): ");
            Date dateTo = dateFormat.parse(scanner.nextLine());

            System.out.print("Origin: ");
            String origin = scanner.nextLine();

            System.out.print("Destination: ");
            String destination = scanner.nextLine();

            System.out.print("Passengers: ");
            int passengers = Integer.parseInt(scanner.nextLine());

            System.out.print("Travel: ");
            String travel = scanner.nextLine();

            System.out.print("Cost: ");
            double cost = Double.parseDouble(scanner.nextLine());

            System.out.print("Currency: ");
            String currency = scanner.nextLine();

            System.out.print("Type of trip: ");
            String tripType = scanner.nextLine();

            Booking booking = new Booking(dateFrom, dateTo, origin, destination, passengers, travel, cost, currency,
                    tripType);
            bookings.add(booking);
            System.out.println("Booking successfully added!");
        } catch (ParseException | NumberFormatException e) {
            System.out.println("Invalid input format. Please check your input.");
        }
    }

    public void viewBookings() {
        System.out.println("\nBookings:");
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
            System.out.println("Options:");
            System.out.println("1. Edit booking");
            System.out.println("2. Delete booking");
            System.out.println("3. Next booking");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // Implement the edit functionality for a booking
                    break;
                case 2:
                    // Implement the delete functionality for a booking
                    break;
                case 3:
                    continue;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
