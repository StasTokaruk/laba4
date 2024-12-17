package flyweight;

import java.util.Map;
import java.util.HashMap;
/**
 * The flyweight.FlyweightFactory class manages the creation and reuse of flyweight.Flyweight objects.
 * It ensures that only one instance of a flyweight.Flyweight is created for each unique icon.
 */
public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();
    /**
     * Retrieves a flyweight.Flyweight object for a given icon. If the flyweight.Flyweight does not
     * exist, a new one is created and stored for future use.
     *
     */
    public Flyweight getFlyweight(String icon) {
        Flyweight flyweight = flyweights.get(icon);

        if (flyweight == null) {
            flyweight = new ConcreteFly(icon);
            flyweights.put(icon, flyweight);
            System.out.println("Creating new Flyweight for icon: " + icon);
        }
        return flyweight;
    }
}