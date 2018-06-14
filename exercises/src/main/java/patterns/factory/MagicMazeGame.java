package patterns.factory;

public class MagicMazeGame extends MazeGame {

    /**
     * This class extends MazeGame, so that means it has to implement makeRoom() too.
     * Maybe we should start differentiating between the the MagicMazeGame and OrdinaryMazeGame here ...
     * @return
     */

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
