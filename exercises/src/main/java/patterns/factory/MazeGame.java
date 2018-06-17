package patterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame {

    private final List<Room> rooms = new ArrayList<Room>();

    /**
     * Maze Game's default constructor just makes two rooms - nothing special.
     *
     * Notice the makeRoom() method below; it's abstract so that means it's a contract.
     */

    public MazeGame() {
        Room room1 = makeRoom();
        Room room2 = makeRoom();

        rooms.add(room1);
        rooms.add(room2);
    }

    abstract public Room makeRoom();
}
