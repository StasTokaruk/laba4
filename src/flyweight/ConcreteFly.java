package flyweight;

/**
 * The flyweight.ConcreteFly class implements the flyweight.Flyweight interface.
 * This class represents a specific variant of an object that uses the flyweight.Flyweight pattern.
 * It is responsible for storing and reusing a particular icon (resource).
 */
public class ConcreteFly implements Flyweight {

    /**
     * Icon that will be reused across different objects.
     */
    private final String icon;

    /**
     * Constructor for the flyweight.ConcreteFly class.
     * Initializes the icon value.
     *
     * @param icon the icon to be reused for different objects
     */
    public ConcreteFly(String icon) {
        this.icon = icon;
    }

    /**
     * Draws the icon for a specified name.
     *
     * @param name the name associated with the icon when it is drawn
     */
    @Override
    public void draw(String name) {
        System.out.println("Drawing " + icon + " for " + name);
    }
}
