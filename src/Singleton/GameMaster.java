package Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class that manages the game space and game pieces.
 */
public class GameMaster {
    private static GameMaster instance;
    private GameSpace gameSpace;
    private List<GamePiece> gamePieces;

    /**
     * Private constructor to prevent direct instantiation.
     *
     * @param width  the width of the game space
     * @param height the height of the game space
     */
    private GameMaster(int width, int height) {
        gameSpace = new GameSpace(width, height);
        gamePieces = new ArrayList<>();
    }

    /**
     * Returns the single instance of the GameMaster class, creating it if necessary.
     *
     * @param width  the width of the game space
     * @param height the height of the game space
     * @return the single instance of the GameMaster class
     */
    public static GameMaster getInstance(int width, int height) {
        if (instance == null) {
            instance = new GameMaster(width, height);
        }
        return instance;
    }

    /**
     * Adds a game piece to the game.
     *
     * @param piece the game piece to add
     */
    public void addPiece(GamePiece piece) {
        gamePieces.add(piece);
    }

    /**
     * Displays information about the game space and all game pieces.
     */
    public void displayGameInfo() {
        gameSpace.displaySpaceInfo();
        for (GamePiece piece : gamePieces) {
            piece.displayPieceInfo();
        }
    }
}
