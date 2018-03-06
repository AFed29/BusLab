import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Person person;
    Bus bus;

    @Before
    public void before() {
        bus = new Bus("CodeClan", 5);
        person = new Person();
    }

    @Test
    public void getNumberOfPassengersIsEmpty() {
        assertEquals(0, bus.numberOfPassengers());
    }

    @Test
    public void addPassengerWhenNotFull() {
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
    }

    @Test
    public void cannotAddPassengerWhenFull() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.numberOfPassengers());
        bus.addPassenger(person);
        assertEquals(5, bus.numberOfPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.numberOfPassengers());
        bus.removePassenger();
        assertEquals(0, bus.numberOfPassengers());
    }
}
