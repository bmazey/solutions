package patterns.factory;

public class OrdinaryMazeGame extends MazeGame {

    /**
     * This class extends MazeGame, so that means it has to implement makeRoom() too.
     * @return
     */

    @Override
    public Room makeRoom() {
        return new OrdinaryRoom();
    }
}
