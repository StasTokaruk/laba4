package Memento;
/**
 * Represents a circle as a graphical element.
 */
public class Circle extends GraphicElement {
    /**
     * Constructor for a Circle.
     *
     * @param position the position of the circle (e.g., "(x, y)")
     * @param radius the radius of the circle
     * @param color the color of the circle
     */
    public Circle(String position, String radius, String color) {
        super(position, radius, color);
    }

    @Override
    public void display() {
        System.out.println("Circle [Position: " + position + ", Radius: " + size + ", Color: " + color + "]");
    }
}
