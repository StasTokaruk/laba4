package Memento;

/**
 * Abstract class representing a graphical element with a position, size, and color.
 */
public abstract class GraphicElement {
    protected String position;
    protected String size;
    protected String color;

    /**
     * Constructor for a graphical element.
     *
     * @param position the position of the element (e.g., "(x, y)")
     * @param size the size of the element (e.g., radius or side length)
     * @param color the color of the element
     */
    public GraphicElement(String position, String size, String color) {
        this.position = position;
        this.size = size;
        this.color = color;
    }

    /**
     * Saves the current state of the graphical element to a memento.
     *
     * @return a Memento object containing the current state
     */
    public Memento saveToMemento() {
        return new Memento(this.toString());
    }

    /**
     * Restores the state of the graphical element from a memento.
     *
     * @param memento the Memento object containing the state to restore
     */
    public void restoreFromMemento(Memento memento) {
        String[] state = memento.getState().split(";");
        this.position = state[0];
        this.size = state[1];
        this.color = state[2];
    }

    @Override
    public String toString() {
        return position + ";" + size + ";" + color;
    }

    /**
     * Displays the graphical element's properties.
     */
    public abstract void display();
}
