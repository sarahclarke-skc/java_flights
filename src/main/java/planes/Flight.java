package planes;

import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private PlaneType planeType;
    private String flightNumber;
    private String destinationAirport;
    private String arrivalAirport;
    private String departureTime;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private int totalBags;

    public Flight(PlaneType planeType, String flightNumber, String destinationAirport, String arrivalAirport, String departureTime) {
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime= departureTime;
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.totalBags = 0;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public int findEmptySeats() {
        return planeType.getSeatCapacity() - passengers.size();
    }

    public void bookPassengerOnFlight(Passenger passenger) {
        if(this.findEmptySeats() > 0) {
            passengers.add(passenger);
            this.totalBags += passenger.getNumberOfBags();
        }
    }

    public int getTotalBags() {
        return totalBags;
    }
}
