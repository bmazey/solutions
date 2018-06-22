package zoo;

public class Panther extends Cat {

    /**
     * This extends Cat, so we have to implement the 'purr' method here.
     * All Cats purr!
     * @return
     */
    public void purr() {
        System.out.println("... purr ...");
    }

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
