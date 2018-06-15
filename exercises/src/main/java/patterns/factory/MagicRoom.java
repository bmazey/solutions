package patterns.factory;

public class MagicRoom extends Room {

    private int numberOfWalls = 6;

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
        return "Teleport";
    }

}
