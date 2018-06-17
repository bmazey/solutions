package patterns.factory;

public class MagicMazeGame extends MazeGame {

    /**
     * This class extends MazeGame, so that means it has to implement makeRoom() too.
     * @return
     */

    @Override
    public Room makeRoom() {
        return new MagicRoom();
    }
}
