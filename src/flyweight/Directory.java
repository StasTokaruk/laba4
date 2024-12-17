package flyweight;

import java.util.List;
import java.util.ArrayList;
/**
 * The flyweight.Directory class represents a directory in the file system.
 * It extends the flyweight.FileSystemComponent class and implements the draw method
 * to display the directory's icon and its contents, which can include files
 * and subdirectories.
 */
public class Directory extends FileSystemComponent {
    private final List<FileSystemComponent> children = new ArrayList<>();
    /**
     * Constructs a new flyweight.Directory with the specified name and icon.
     *
     */
    public Directory(String name, Flyweight icon) {
        super(name, icon);
    }
    /**
     * Adds a file or subdirectory to the directory.
     *
     */
    public void add(FileSystemComponent component) {
        children.add(component);
    }
    /**
     * Draws the directory by displaying its icon and recursively drawing
     * all of its child components (files and subdirectories).
     */
    @Override
    public void draw() {
        icon.draw(name);
        for (FileSystemComponent child : children) {
            child.draw();
        }
    }
}