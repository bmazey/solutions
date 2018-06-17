package patterns.factory;

public class OrdinaryRoom extends Room {

    private int numberOfWalls = 4;
    private int numberOfDoors = 2;
    private String color = "White";
    private boolean isMirrored = false;

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
    public void setMirrored(boolean mirroed) {
        isMirrored = mirroed;
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
        return "Open Door";
    }
}