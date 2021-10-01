package planes;

public class FlightManager {

    Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double getPersonalBaggageAllowance(Flight flight) {
        double totalWeightCapacity = flight.getPlaneType().getWeight();
        int totalPassengerCapacity = flight.getPlaneType().getSeatCapacity();
        return totalWeightCapacity / totalPassengerCapacity;
    }

    public double calculateTotalBaggageWeightOnFlight(Flight flight) {
        return flight.getPassengers().size() * getPersonalBaggageAllowance(flight);
    }
}
