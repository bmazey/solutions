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
                .setColor("Red")
                .build();
    }

    public Car constructSportscar() {
        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

    public Car constructEighteenWheeler() {
        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

    public Car constructSedan() {
        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

}
