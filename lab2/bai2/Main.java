import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * RUN
         * 
         * javac -d out *.java
         * java -cp out Main
         * 
         */

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(new Ticket(VehicleType.CAR, 5f));
        tickets.add(new Ticket(VehicleType.CAR, 10f));
        tickets.add(new Ticket(VehicleType.MOTORBIKE, 3f));
        tickets.add(new Ticket(VehicleType.BICYCLE, 1.5f));

        for (Ticket ticket : tickets) {
            System.out.println("- ");
            System.out.println("Vehicle Type: " + ticket.getVehicleType());
            System.out.println("Hours Parked: " + ticket.getHoursParked());
            System.out.println("Total Fee: " + ticket.calculateFee());
        }

    }
}
