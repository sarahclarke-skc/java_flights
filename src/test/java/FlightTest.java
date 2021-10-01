import org.junit.Before;
import org.junit.Test;
import person.CabinCrewMember;
import person.Passenger;
import person.Pilot;
import person.Rank;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        flight = new Flight(PlaneType.AIRBUSA300, "KL926", "LED", "AMS", "13:05");
        passenger = new Passenger("Nancy Mitford", 3);
        pilot = new Pilot("Tom Weigand", Rank.CAPTAIN, "12345");
        cabinCrewMember = new CabinCrewMember("John Smith", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.AIRBUSA300, flight.getPlaneType());
    }

    @Test
    public void planeHasSeatCapacity() {
        assertEquals(4, PlaneType.AIRBUSA300.getSeatCapacity());
    }

    @Test
    public void planeHasTotalWeight() {
        assertEquals(300, PlaneType.AIRBUSA300.getWeight());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("KL926", flight.getFlightNumber());
    }

    @Test
    public void hasDesinationAirport() {
        assertEquals("LED", flight.getDestinationAirport());
    }

    @Test
    public void hasArrivalAirport() {
        assertEquals("AMS", flight.getArrivalAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("13:05", flight.getDepartureTime());
    }

    @Test
    public void passengerListStartsAtZero() {
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void pilotListStartsAtZero() {
        assertEquals(0, flight.getPilots().size());
    }

    @Test
    public void cabinCrewMemberListStartsAtZero() {
        assertEquals(0, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightHasPilot() {
        flight.addPilot(pilot);
        flight.addPilot(pilot);
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void flightHasCabinCrew() {
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        assertEquals(3, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightHasPassengers() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canFindEmptySeats() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(1, flight.findEmptySeats());
    }



}
