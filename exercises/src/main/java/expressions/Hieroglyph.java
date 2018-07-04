package expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hieroglyph {

    public boolean worshipSacredCats(String s) {
        Pattern p = Pattern.compile("(.*)cat(.*)");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public boolean discoverPyramidInSand(String s) {
        Pattern p = Pattern.compile("(sand*)pyramid(sand*)");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public boolean readAlphanumericGlyph(String s) {
        Pattern p = Pattern.compile("[0-9]{2,4}[a-z]{3,5}");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public boolean captureGoldScarab(String s) {
        Pattern p = Pattern.compile("(gold)(?=.*scarab.*)");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public boolean avoidNileCrocodile(String s) {
        Pattern p = Pattern.compile("(?!.*crocodile).*nile.*");
        Matcher m = p.matcher(s);
        return m.matches();
    }

    public List<String> raidTutsTomb(String s) {
        ArrayList<String> loot = new ArrayList<>();

        Pattern p = Pattern.compile("(?!trap)(gold|incense|gemstones|artifacts){2,}?");
        Matcher m = p.matcher(s);

        int i = 0;
        while (m.find()) {
            loot.add(m.group(i));
            i++;
        }

        return loot;
    }

    public static void main (String[] args) {

        /**
         * EXPERIMENTS ONLY!
         */
    }
}
