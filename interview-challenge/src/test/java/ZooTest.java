import org.junit.Test;
import zoo.Cat;
import zoo.Panther;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ZooTest {

    @Test
    public void testPantherSize() {
        Cat myPanther = new Panther();
        assertEquals(myPanther.getSize().intValue(), 5);
    }

    @Test
    public void testPantherColoer() {
        Cat myPanther = new Panther();
        assertThat(myPanther.getColor().name(), equalToIgnoringCase("BLACK"));
    }
}
