package Memento;

import java.util.ArrayList;
import java.util.List;
/**
 * Manages the history of saved states for a graphical element.
 */
public class Caretaker {
    private final List<Memento> history = new ArrayList<>();

    /**
     * Saves a memento (state) to the history.
     *
     * @param memento the memento to save
     */
    public void save(Memento memento) {
        history.add(memento);
    }

    /**
     * Restores a memento (state) from the history.
     *
     * @param index the index of the memento to restore
     * @return the restored memento
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public Memento restore(int index) {
        if (index < 0 || index >= history.size()) {
            throw new IndexOutOfBoundsException("Invalid index!");
        }
        return history.get(index);
    }
}
