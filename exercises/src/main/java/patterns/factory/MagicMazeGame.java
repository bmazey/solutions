package patterns.factory;

public class MagicMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
