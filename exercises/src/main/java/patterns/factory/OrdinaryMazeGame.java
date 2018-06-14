package patterns.factory;

public class OrdinaryMazeGame extends MazeGame {

    @Override
    protected Room makeRoom() {
        return new OrdinaryRoom();
    }
}
