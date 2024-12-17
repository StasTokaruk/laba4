package flyweight;

/**
 * The flyweight.FileSystemComponent class serves as the base class for both files and directories in the
 file system.
 * It holds common attributes such as the name of the component and its associated flyweight.Flyweight icon.
 * This class is abstract and requires subclasses to implement the draw method for displaying the
 component.
 */
public abstract class FileSystemComponent {
    protected String name;
    protected Flyweight icon;
    /**
     * Constructs a new flyweight.FileSystemComponent with the specified name and icon.
     *
     */
    public FileSystemComponent(String name, Flyweight icon) {
        this.name = name;
        this.icon = icon;
    }
    /**
     * Draws the file system component. This method must be implemented by subclasses.
     */
    public abstract void draw();
}