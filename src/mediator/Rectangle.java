/**
 * The Rectangle class represents a rectangle and acts as a Colleague in the Mediator pattern.
 */
package mediator;

public class Rectangle extends Colleague {
    private String color;

    /**
     * Constructor for the Rectangle class.
     *
     * @param mediator The mediator managing the interaction between components.
     * @param color    The initial color of the rectangle.
     */
    public Rectangle(Mediator mediator, String color) {
        super(mediator);
        this.color = color;
    }

    /**
     * Sets the new color of the rectangle.
     *
     * @param color  The new color.
     * @param notify Whether to notify the mediator about the color change.
     */
    @Override
    public void setColor(String color, boolean notify) {
        this.color = color;
        System.out.println("Rectangle color changed to: " + color);
        if (notify) {
            notifyMediator("colorChanged");
        }
    }

    /**
     * Returns the current color of the rectangle.
     *
     * @return The current color.
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Draws the rectangle with the current color.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with color: " + color);
    }
}
