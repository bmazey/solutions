package patterns;

import org.junit.Test;
import patterns.factory.MagicMazeGame;
import patterns.factory.MazeGame;
import patterns.factory.OrdinaryMazeGame;
import patterns.factory.Room;

public class MazeGameTest {

    MazeGame ordinaryMazeGame = new OrdinaryMazeGame();
    MazeGame magicMazeGame = new MagicMazeGame();

    @Test
    public void playOrdinaryMazeGame() {
        Room ordinaryRoom = ordinaryMazeGame.makeRoom();

    }

    @Test
    public void playMagicMazeGame() {
        Room magicRoom = magicMazeGame.makeRoom();

    }
}
