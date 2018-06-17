package patterns;

import org.junit.Test;
import patterns.factory.MagicMazeGame;
import patterns.factory.MazeGame;
import patterns.factory.OrdinaryMazeGame;
import patterns.factory.Room;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class MazeGameTest {

    MazeGame ordinaryMazeGame = new OrdinaryMazeGame();
    MazeGame magicMazeGame = new MagicMazeGame();

    @Test
    public void playOrdinaryMazeGame() {
        Room ordinaryRoom = ordinaryMazeGame.makeRoom();
        assertThat(ordinaryRoom.getNumberOfWalls(), equalTo(4));
        assertThat(ordinaryRoom.getNumberOfDoors(), equalTo(2));
        assertThat(ordinaryRoom.getColor(), equalToIgnoringCase("White"));
        assertThat(ordinaryRoom.isMirrored(), equalTo(false));
        assertThat(ordinaryRoom.traverse(), equalToIgnoringCase("Open Door"));
    }

    @Test
    public void playMagicMazeGame() {
        Room magicRoom = magicMazeGame.makeRoom();
        assertThat(magicRoom.getNumberOfWalls(), equalTo(6));
        assertThat(magicRoom.getNumberOfDoors(), equalTo(0));
        assertThat(magicRoom.getColor(), equalToIgnoringCase("Purple"));
        assertThat(magicRoom.isMirrored(), equalTo(true));
        assertThat(magicRoom.traverse(), equalToIgnoringCase("Teleport"));

    }
}
