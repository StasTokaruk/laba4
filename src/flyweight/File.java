package flyweight;

/**
 * The flyweight.File class represents a file in the file system.
 * It extends the flyweight.FileSystemComponent class and implements the draw method
 * to display the file's icon and its name.

 */
public class File extends FileSystemComponent {
    /**
     * Constructs a new flyweight.File with the specified name and icon.
     *
     */
    public File(String name, Flyweight icon) {
        super(name, icon);
    }
    /**
     * Draws the file by delegating the drawing task to its associated flyweight.Flyweight icon.
     */
    @Override
    public void draw() {
        icon.draw(name);
    }
}