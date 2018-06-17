package patterns.factory;

public class MagicRoom extends Room {

    private int numberOfWalls = 6;
    private int numberOfDoors = 0;
    private String color = "Purple";
    private boolean isMirrored = true;

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isMirrored() {
        return isMirrored;
    }

    @Override
    public void setMirrored(boolean mirrored) {
        isMirrored = mirrored;
    }

    @Override
    public int getNumberOfWalls() {
        return numberOfWalls;
    }

    @Override
    public void setNumberOfWalls(int numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    public String traverse() {
        return "Teleport";
    }

}
