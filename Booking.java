import java.text.SimpleDateFormat;
import java.util.Date;

class Booking {
    private static int nextId = 1;

    private int id;
    private Date dateFrom;
    private Date dateTo;
    private String origin;
    private String destination;
    private int passengers;
    private String travel;
    private double cost;
    private String currency;
    private String tripType;

    public Booking(
            Date dateFrom,
            Date dateTo,
            String origin,
            String destination,
            int passengers,
            String travel,
            double cost,
            String currency,
            String tripType) {
        this.id = nextId++;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.origin = origin;
        this.destination = destination;
        this.passengers = passengers;
        this.travel = travel;
        this.cost = cost;
        this.currency = currency;
        this.tripType = tripType;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
        return "Booking #" + id +
                "\nDate From: " + dateFormat.format(dateFrom) +
                "\nDate To: " + dateFormat.format(dateTo) +
                "\nOrigin: " + origin +
                "\nDestination: " + destination +
                "\nPassengers: " + passengers +
                "\nTravel: " + travel +
                "\nCost: " + cost + " " + currency +
                "\nType of trip: " + tripType;
    }
}
