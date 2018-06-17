package patterns.builder;

/**
 * The builder abstraction.
 */
public interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);

    CarBuilder setWheels(final int wheels);

    CarBuilder setHasTrunk(final boolean hasTrunk);

    CarBuilder setFuel(final String fuel);

    CarBuilder setDoors(final int doors);

}
