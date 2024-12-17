package Singleton;

/**
 * Represents the game space with specified dimensions.
 */
public class GameSpace {
    private int width;
    private int height;

    /**
     * Constructs a GameSpace object with specified width and height.
     *
     * @param width  the width of the game space
     * @param height the height of the game space
     */
    public GameSpace(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Returns the width of the game space.
     *
     * @return the width of the game space
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the width of the game space.
     *
     * @param width the new width of the game space
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Returns the height of the game space.
     *
     * @return the height of the game space
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the game space.
     *
     * @param height the new height of the game space
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Displays the dimensions of the game space.
     */
    public void displaySpaceInfo() {
        System.out.println("Game Space: " + width + "x" + height);
    }
}
