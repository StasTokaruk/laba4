package Memento;
/**
 * Represents a triangle as a graphical element.
 */
public class Triangle extends GraphicElement {
    /**
     * Constructor for a Triangle.
     *
     * @param position the position of the triangle (e.g., "(x, y)")
     * @param sideLength the length of the triangle's side
     * @param color the color of the triangle
     */
    public Triangle(String position, String sideLength, String color) {
        super(position, sideLength, color);
    }

    @Override
    public void display() {
        System.out.println("Triangle [Position: " + position + ", Side: " + size + ", Color: " + color + "]");
    }
}
