package patterns.factory;

public abstract class Room {

    /**
     * This class establishes a baseline for a Room.
     * Basically, this only enforces that the Rooms have a number of walls, and a setter / getter.
     *
     * TODO - is is normal to put values in here?
     */
    private int numberOfWalls = 4;
    private int numberOfDoors;
    private String color;
    private boolean isMirrored;

    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMirrored() {
        return isMirrored;
    }

    public void setMirrored(boolean mirrored) {
        isMirrored = mirrored;
    }

    //here are some more interesting methods ..
    public abstract String traverse();

}