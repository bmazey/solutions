package zoo;

public abstract class Cat implements Animal {

    private int size = 2;
    private int numberOfLegs = 4;
    private String call = "meow";
    private Color color = Color.BROWN;
    private Vertebrate vertebrate = Vertebrate.MAMMAL;

    public Integer getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Integer getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vertebrate getVertebrate() {
        return vertebrate;
    }

    public void setVertebrate(Vertebrate vertebrate) {
        this.vertebrate = vertebrate;
    }

}
