package zoo;

public interface Animal {

    /**
     * Note that because we're working within an interface, our boolean 'isAnimal' is implicitly final!
     * These methods are also implicitly absract, but interfaces cannot provide default implementations to these methods
     * like abstract classes can.
     *
     * A class can implement more than one interface, but can only extend a single abstract class.
     */
    boolean isAnimal = true;

    Integer getSize();
    Integer getNumberOfLegs();

    String getCall();

    /**
     * Here are the enums ...
     */
    Color getColor();
    Vertebrate getVertebrate();

}
