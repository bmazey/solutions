package patterns;

import org.junit.Test;
import patterns.builder.Car;
import patterns.builder.CarBuildDirector;
import patterns.builder.CarBuilder;
import patterns.builder.CarBuilderImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class CarBuilderTest {

    final CarBuilder builder = new CarBuilderImpl();
    final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);

    @Test
    public void assertSuvProperties() {
        Car mySUV = carBuildDirector.constructSUV();
        assertThat(mySUV.getColor(), equalToIgnoringCase("Yellow"));
        assertThat(mySUV.getDoors(), equalTo(4));
        assertThat(mySUV.getWheels(), equalTo(4));
        assertThat(mySUV.getHasTrunk(), equalTo(true));
        assertThat(mySUV.getFuel(), equalToIgnoringCase("Unleaded Gas"));
    }

    @Test
    public void assertSportscarProperties() {
        Car mySportscar = carBuildDirector.constructSportscar();
        assertThat(mySportscar.getColor(), equalToIgnoringCase("Red"));
        assertThat(mySportscar.getDoors(), equalTo(2));
        assertThat(mySportscar.getWheels(), equalTo(4));
        assertThat(mySportscar.getHasTrunk(), equalTo(false));
        assertThat(mySportscar.getFuel(), equalToIgnoringCase("Premium Gas"));
    }

    @Test
    public void assertEighteenWheelerProperties() {
        Car myEighteenWheeler = carBuildDirector.constructEighteenWheeler();
        assertThat(myEighteenWheeler.getColor(), equalToIgnoringCase("Blue"));
        assertThat(myEighteenWheeler.getDoors(), equalTo(2));
        assertThat(myEighteenWheeler.getWheels(), equalTo(18));
        assertThat(myEighteenWheeler.getHasTrunk(), equalTo(false));
        assertThat(myEighteenWheeler.getFuel(), equalToIgnoringCase("Diesel"));
    }

    @Test
    public void assertTeslaProperties() {
        Car myTesla = carBuildDirector.constructTesla();
        assertThat(myTesla.getColor(), equalToIgnoringCase("Black"));
        assertThat(myTesla.getDoors(), equalTo(4));
        assertThat(myTesla.getWheels(), equalTo(4));
        assertThat(myTesla.getHasTrunk(), equalTo(true));
        assertThat(myTesla.getFuel(), equalToIgnoringCase("Electricity"));
    }
}
