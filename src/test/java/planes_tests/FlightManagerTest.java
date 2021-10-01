package planes_tests;

import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import planes.Flight;
import planes.FlightManager;
import planes.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Passenger passenger;

    private FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight(PlaneType.AIRBUSA300, "KL926", "LED", "AMS", "13:05");
        passenger = new Passenger("Nancy Mitford", 3);
        //starting to get confused
        flightManager = new FlightManager(flight);
    }

    @Test
    public void totalBagsStartsAtZero() {
        assertEquals(0, flight.getTotalBags());
    }

    //not sure if this test should be here - I have a similar one in planes_tests.FlightTest
    @Test
    public void canAddBaggage() {
        flight.bookPassengerOnFlight(passenger);
        assertEquals(3, flight.getTotalBags());
    }

//    calculate how much baggage weight should be reserved for each passenger for a flight
// my maths is terrible - is that even how you'd do this?
    @Test
    public void canCalculateBaggageWeightPerPassenger() {
        double result = flightManager.getPersonalBaggageAllowance();
        assertEquals(75, result, 0.001);
    }
//    calculate how much baggage weight is booked by passengers of a flight
    

//    calculate how much overall weight reserved for baggage remains for a flight

}
