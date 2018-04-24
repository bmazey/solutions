package zoo;

public abstract class Cat implements Animal {

    /**
     * Within this abstract class we can define default implementations of the methods we created in the interface.
     * In fact we're required to, because it implements Animal.
     *
     * Abstract classes can't be instantiated, which means we can't write ...
     *
     *                  X not allowed  ->  Cat myCat = new Cat();
     *
     * Unlike an interface, variables within this class are not necessarily final.
     */

    private int size = 2;
    private int numberOfLegs = 4;
    private String call = "meow";
    private Color color = Color.BROWN;
    private Vertebrate vertebrate = Vertebrate.MAMMAL;

    /**
     * The method below is an abstract method that is specific to Cat - it's not specified in the Animal interface!
     * Practically speaking, this means that any class that extends Cat needs to provide an implementation for this
     * method ...
     *
     * @return
     */
    abstract void purr();

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
