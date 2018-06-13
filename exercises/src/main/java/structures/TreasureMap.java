package structures;

import java.util.HashMap;
import java.util.Map;

public class TreasureMap {
    public static void main (String[] args) {

    }

    public Map<String, String> createTreasureMap() {
        Map<String, String> treasureMap = new HashMap<String, String>();
        treasureMap.put("beach", "sandy shores");
        treasureMap.put("coast", "ocean reef");
        treasureMap.put("volcano", "hot lava");
        treasureMap.put("x", "marks the spot");

        return treasureMap;
    }
}
