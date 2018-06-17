package patterns.factory;

public abstract class Room {

    /**
     * This class establishes a baseline for a Room.
     * Check out the interesting "traverse" method below ...
     */

    public abstract int getNumberOfWalls();

    public abstract void setNumberOfWalls(int numberOfWalls);

    public abstract int getNumberOfDoors();

    public abstract void setNumberOfDoors(int numberOfDoors);

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract boolean isMirrored();

    public abstract void setMirrored(boolean mirrored);

    public abstract String traverse();

}