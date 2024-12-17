/**
 * The GraphicsMediator class implements the logic for synchronizing colors between graphic elements.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

public class GraphicsMediator implements Mediator {
    private List<Colleague> elements = new ArrayList<>();

    /**
     * Adds a graphic element to the mediator.
     *
     * @param element The element to be added.
     */
    public void addElement(Colleague element) {
        elements.add(element);
    }

    /**
     * Handles notifications from colleagues (components).
     *
     * @param sender The component that sent the notification.
     * @param event  The event that occurred.
     */
    @Override
    public void notify(Colleague sender, String event) {
        if (event.equals("colorChanged")) {
            System.out.println("Mediator: Synchronizing colors with " + sender.getClass().getSimpleName());
            synchronizeColors(sender);
        }
    }

    /**
     * Synchronizes the colors of all components except the sender.
     *
     * @param sender The component that initiated the color change.
     */
    private void synchronizeColors(Colleague sender) {
        for (Colleague element : elements) {
            if (element != sender) {
                element.setColor(sender.getColor(), false);
            }
        }
    }
}
