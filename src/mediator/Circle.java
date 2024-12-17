/**
 * The Circle class represents a circle and acts as a Colleague in the Mediator pattern.
 */
package mediator;

public class Circle extends Colleague {
    private String color;

    /**
     * Constructor for the Circle class.
     *
     * @param mediator The mediator managing the interaction between components.
     * @param color    The initial color of the circle.
     */
    public Circle(Mediator mediator, String color) {
        super(mediator);
        this.color = color;
    }

    /**
     * Sets the new color of the circle.
     *
     * @param color  The new color.
     * @param notify Whether to notify the mediator about the color change.
     */
    @Override
    public void setColor(String color, boolean notify) {
        this.color = color;
        System.out.println("Circle color changed to: " + color);
        if (notify) {
            notifyMediator("colorChanged");
        }
    }

    /**
     * Returns the current color of the circle.
     *
     * @return The current color.
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Draws the circle with the current color.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Circle with color: " + color);
    }
}
