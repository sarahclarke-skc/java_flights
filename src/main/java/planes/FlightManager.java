package planes;

public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double getPersonalBaggageAllowance() {
        double totalWeightCapacity = flight.getPlaneType().getWeight();
        int totalPassengerCapacity = flight.getPlaneType().getSeatCapacity();
        return totalWeightCapacity / totalPassengerCapacity;
    }
}
