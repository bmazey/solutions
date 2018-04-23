package zoo;

public interface Animal {

    Integer getSize();
    Integer getNumberOfLegs();

    String getCall();

    /**
     * Here are the enums ...
     */
    Color getColor();
    AnimalClass getAnimalClass();

}
