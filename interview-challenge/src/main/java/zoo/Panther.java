package zoo;

public class Panther extends Cat {

    @Override
    public Integer getSize() {
        return 5;
    }

    @Override
    public String getCall() {
        return "ROAR";
    }

    @Override
    public Color getColor() {
        return Color.BLACK;
    }

}
