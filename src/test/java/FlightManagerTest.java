import org.junit.Before;
import org.junit.Test;
import person.Passenger;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Passenger passenger;

    private FlightManager flightManager;

    @Before
    public void before(){
        flight = new Flight(PlaneType.AIRBUSA300, "KL926", "LED", "AMS", "13:05");
        passenger = new Passenger("Nancy Mitford", 3);
        flightManager = new FlightManager();
    }

    @Test
    public void totalBagsStartsAtZero() {
        assertEquals(0, flight.getTotalBags());
    }

}
