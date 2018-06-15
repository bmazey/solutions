package patterns.factory;

public class OrdinaryRoom extends Room {

    private int numberOfWalls = 4;

//    @Override
//    public int getNumberOfWalls() {
//        return numberOfWalls;
//    }
//
//    @Override
//    public void setNumberOfWalls(int numberOfWalls) {
//        this.numberOfWalls = numberOfWalls;
//    }

    public String traverse() {
        return "Open Door";
    }
}