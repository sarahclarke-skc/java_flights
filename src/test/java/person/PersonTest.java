package person;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Test
    public void personAsPilot() {
        person = new Pilot("Tom Weigand", Rank.CAPTAIN, "12345");
        assertEquals("Tom Weigand", person.getName());
    }

    @Test
    public void personAsPilotChangeName() {
        person = new Pilot("Tom Weigand", Rank.CAPTAIN, "12345");
        person.setName("Katya Weigand");
        assertEquals("Katya Weigand", person.getName());
    }

    @Test
    public void objectRemembersItsType() {
        person = new Pilot("Tom Weigand", Rank.CAPTAIN, "12345");
        Pilot pilot = (Pilot) person;
        assertEquals("12345", pilot.getLicenceNumber());
    }
}
