package Singleton;

/**
 * Represents a game piece with a name and coordinates.
 */
public class GamePiece {
    private String name;
    private int x;
    private int y;

    /**
     * Constructs a GamePiece object with a name and initial coordinates.
     *
     * @param name the name of the game piece
     * @param x    the x-coordinate of the game piece
     * @param y    the y-coordinate of the game piece
     */
    public GamePiece(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the name of the game piece.
     *
     * @return the name of the game piece
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the game piece.
     *
     * @param name the new name of the game piece
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the x-coordinate of the game piece.
     *
     * @return the x-coordinate of the game piece
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the game piece.
     *
     * @param x the new x-coordinate of the game piece
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of the game piece.
     *
     * @return the y-coordinate of the game piece
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the game piece.
     *
     * @param y the new y-coordinate of the game piece
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Displays information about the game piece, including its name and position.
     */
    public void displayPieceInfo() {
        System.out.println("Piece: " + name + " at (" + x + ", " + y + ")");
    }
}
