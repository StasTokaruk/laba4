package Memento;
/**
 * Represents a memento for saving the state of a graphical element.
 */
public class Memento {
    private final String state;

    /**
     * Constructor for creating a memento with a specific state.
     *
     * @param state the state to save in the memento
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * Retrieves the saved state from the memento.
     *
     * @return the saved state
     */
    public String getState() {
        return state;
    }
}