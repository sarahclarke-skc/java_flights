package people;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Nancy Mitford", 3);
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(3, passenger.getNumberOfBags());
    }

    @Test
    public void canChangeNumberOfBags() {
        passenger.setNumberOfBags(5);
        assertEquals(5, passenger.getNumberOfBags());
    }
}
