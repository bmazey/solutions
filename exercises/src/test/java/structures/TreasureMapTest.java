package structures;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class TreasureMapTest {

    TreasureMap myMap = new TreasureMap();
    Map<String, String> treasureMap = myMap.createTreasureMap();

    @Test
    public void checkSandyBeach() {
        assertThat(treasureMap.get("beach"), equalToIgnoringCase("sandy shores"));
    }

    @Test
    public void checkSeaShore() {
        assertThat(treasureMap.get("coast"), equalToIgnoringCase("ocean reef"));
    }

    @Test
    public void checkVolcano() {
        assertThat(treasureMap.get("volcano"), equalToIgnoringCase("hot lava"));
    }

    @Test
    public void checkXMarksTheSpot() {
        assertThat(treasureMap.get("x"), equalToIgnoringCase("marks the spot"));
    }
}
