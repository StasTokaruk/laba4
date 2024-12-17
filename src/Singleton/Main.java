package Singleton;

/**
 * Entry point for the application.
 */
public class Main {
    public static void main(String[] args) {
        GameMaster gameMaster = GameMaster.getInstance(10, 10);


        GamePiece piece1 = new GamePiece("F1", 1, 1);
        GamePiece piece2 = new GamePiece("F2", 2, 2);


        gameMaster.addPiece(piece1);
        gameMaster.addPiece(piece2);
        gameMaster = GameMaster.getInstance(11, 11);

        gameMaster.displayGameInfo();
    }
}
