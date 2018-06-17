package patterns.builder;

public class CarBuilderImpl implements CarBuilder {

    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    public Car build() {
        return car;
    }

    public CarBuilder setColor(final String color) {
        car.setColor(color);
        return this;
    }

    public CarBuilder setWheels(final int wheels) {
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder setHasTrunk(final boolean hasTrunk) {
        car.setHasTrunk(hasTrunk);
        return this;
    }

    public CarBuilder setFuel(final String fuel) {
        car.setFuel(fuel);
        return this;
    }

    public CarBuilder setDoors(final int doors) {
        car.setDoors(doors);
        return this;
    }
}
