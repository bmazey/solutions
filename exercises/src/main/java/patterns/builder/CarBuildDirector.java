package patterns.builder;

public class CarBuildDirector {
    /**
     * This is just an example of how to use a "director" class to use the builder pattern.
     *
     */
    private CarBuilder builder;

    public CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructSUV() {
        return builder.setWheels(4)
                .setColor("Yellow")
                .setDoors(4)
                .setFuel("Unleaded Gas")
                .setHasTrunk(true)
                .build();
    }

    public Car constructSportscar() {
        return builder.setWheels(4)
                .setColor("Red")
                .setDoors(2)
                .setFuel("Premium Gas")
                .setHasTrunk(false)
                .build();
    }

    public Car constructEighteenWheeler() {
        return builder.setWheels(18)
                .setColor("Blue")
                .setDoors(2)
                .setFuel("Diesel")
                .setHasTrunk(false)
                .build();
    }

    public Car constructTesla() {
        return builder.setWheels(4)
                .setColor("Black")
                .setDoors(4)
                .setFuel("Electricity")
                .setHasTrunk(true)
                .build();
    }

}
