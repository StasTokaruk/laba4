/**
 * The abstract Colleague class defines the base behavior of participants in the Mediator pattern.
 */
package mediator;

public abstract class Colleague {
    protected Mediator mediator;

    /**
     * Constructor for the Colleague class.
     *
     * @param mediator The mediator managing interactions with other components.
     */
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Sends a notification to the mediator about an event.
     *
     * @param event The name of the event.
     */
    public void notifyMediator(String event) {
        mediator.notify(this, event);
    }

    /**
     * Sets the color of the component.
     *
     * @param color  The new color.
     * @param notify Whether to notify the mediator about the color change.
     */
    public abstract void setColor(String color, boolean notify);

    /**
     * Returns the current color of the component.
     *
     * @return The current color.
     */
    public abstract String getColor();

    /**
     * Draws the component.
     */
    public abstract void draw();
}
