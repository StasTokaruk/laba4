/**
 * The Mediator interface defines methods for communication between various components (Colleagues).
 */
package mediator;

public interface Mediator {
    /**
     * Handles messages from components.
     *
     * @param sender The component sending the message.
     * @param event  The event that occurred in the component.
     */
    void notify(Colleague sender, String event);
}