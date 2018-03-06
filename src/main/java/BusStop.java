import java.lang.reflect.Array;
import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }

    public int queueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        if (queueLength() > 0) {
            return this.queue.remove(0);
        }
        else {
            return null;
        }
    }
}
