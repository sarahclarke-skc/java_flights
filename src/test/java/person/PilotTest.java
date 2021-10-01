package person;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Tom Weigand", Rank.CAPTAIN, "12345");
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("I am king of the skies!", pilot.flyPlane());
    }

}
