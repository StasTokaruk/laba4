package flyweight;

/**
 * The flyweight.Flyweight interface defines a method for drawing a shape or object.
 * This is part of the flyweight.Flyweight design pattern, which is used to minimize
 * memory usage by sharing common parts of objects.
 */
public interface Flyweight {
    /**
     * Draws a shape or object with a specific name.
     *
     */
    void draw(String name);
}