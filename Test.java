import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Flight Booking Automation");
            System.out.println("Please enter your booking details:");

            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");

                System.out.print("Date From (M/d/yyyy): ");
                Date dateFrom = dateFormat.parse(scanner.nextLine());

                System.out.print("Date To (M/d/yyyy): ");
                Date dateTo = dateFormat.parse(scanner.nextLine());

                if (dateFrom.after(dateTo)) {
                    System.out.println("Date From cannot be greater than Date To.");
                    return;
                }

                System.out.print("Origin: ");
                String origin = scanner.nextLine();

                System.out.print("Destination: ");
                String destination = scanner.nextLine();

                if (origin.equalsIgnoreCase(destination)) {
                    System.out.println("Origin cannot be the same as Destination.");
                    return;
                }

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

                System.out.println("\nBooking Details:");
                System.out.println("Date From: " + dateFormat.format(dateFrom));
                System.out.println("Date To: " + dateFormat.format(dateTo));
                System.out.println("Origin: " + origin);
                System.out.println("Destination: " + destination);
                System.out.println("Passengers: " + passengers);
                System.out.println("Travel: " + travel);
                System.out.println("Cost: " + cost + " " + currency);
                System.out.println("Type of trip: " + tripType);

                // Add code here to handle the submission of booking (e.g., saving to a
                // database)

            } catch (ParseException | NumberFormatException e) {
                System.out.println("Invalid input format. Please check your input.");
            }
        }
    }
}
