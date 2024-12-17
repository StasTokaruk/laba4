/**
 * The Memento design pattern implementation for graphical elements.
 */
package Memento;

/**
 * The main class demonstrating the use of the Memento pattern.
 */
public class Main {
    /**
     * The entry point of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle("(10, 20)", "15", "red");
        Triangle triangle = new Triangle("(30, 40)", "20", "blue");

        System.out.println("Початковий стан:");
        circle.display();
        triangle.display();

        Caretaker circleCaretaker = new Caretaker();
        Caretaker triangleCaretaker = new Caretaker();

        circleCaretaker.save(circle.saveToMemento());
        triangleCaretaker.save(triangle.saveToMemento());

        circle.position = "(50, 60)";
        circle.size = "25";
        circle.color = "green";

        triangle.position = "(70, 80)";
        triangle.size = "30";
        triangle.color = "yellow";

        System.out.println("\nЗмінений стан:");
        circle.display();
        triangle.display();

        circleCaretaker.save(circle.saveToMemento());
        triangleCaretaker.save(triangle.saveToMemento());

        circle.restoreFromMemento(circleCaretaker.restore(0));
        triangle.restoreFromMemento(triangleCaretaker.restore(0));

        System.out.println("\nВідновлений стан:");
        circle.display();
        triangle.display();

        circle.restoreFromMemento(circleCaretaker.restore(1));
        triangle.restoreFromMemento(triangleCaretaker.restore(1));

        System.out.println("\nВідновлений стан 2:");
        circle.display();
        triangle.display();
    }
}
