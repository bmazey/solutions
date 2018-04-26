import org.junit.Test;
import zoo.Cat;
import zoo.Panther;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ZooTest {

    /**
     * Let's start by making all of the Animals, then testing their properties.
     */

    Cat myPanther = new Panther();

    @Test
    public void testPantherSize() {
        assertEquals(myPanther.getSize().intValue(), 5);
    }

    @Test
    public void testPantherLegs() {
        assertEquals(myPanther.getNumberOfLegs().intValue(), 4);
    }

    @Test
    public void testPantherColor() {
        assertThat(myPanther.getColor().name(), equalToIgnoringCase("BLACK"));
    }

    @Test
    public void testPantherCall() {
        assertThat(myPanther.getCall(), equalToIgnoringCase("Roar"));
    }
}
