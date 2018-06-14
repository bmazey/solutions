package patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {

    private final List<Room> rooms = new ArrayList<Room>();

    /**
     * Maze Game's default constructor just makes two rooms - nothing special.
     */

    public MazeGame() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();

        rooms.add(room1);
        rooms.add(room2);
    }

    abstract protected Room makeRoom();
}
