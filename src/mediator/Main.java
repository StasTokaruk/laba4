/**
 * The Main class demonstrates the use of the Mediator pattern.
 */
package mediator;

public class Main {
    public static void main(String[] args) {

        GraphicsMediator mediator = new GraphicsMediator();

        Rectangle rectangle = new Rectangle(mediator, "Red");
        Circle circle = new Circle(mediator, "Blue");

        mediator.addElement(rectangle);
        mediator.addElement(circle);

        rectangle.draw();
        circle.draw();

        System.out.println("\nChanging Rectangle color to Green");
        rectangle.setColor("Green", true);

        rectangle.draw();
        circle.draw();

        System.out.println("\nChanging Circle color to Yellow");
        circle.setColor("Yellow", true);

        rectangle.draw();
        circle.draw();
    }
}