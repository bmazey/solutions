package expressions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HieroglyphTest {

    Hieroglyph hiero = new Hieroglyph();

    @Test
    public void containsSacredCats() {

        //all cats are sacred!

        assertEquals(hiero.worshipSacredCats("sacred cat"), true);
        assertEquals(hiero.worshipSacredCats("cat sacred sacred"), true);
        assertEquals(hiero.worshipSacredCats("sacred sacred cat"), true);
        assertEquals(hiero.worshipSacredCats("sacred"), false);
        assertEquals(hiero.worshipSacredCats("cat"), true);
    }

    @Test
    public void containsPyramidInSand() {
        assertEquals(hiero.discoverPyramidInSand("sand sand sand"), false);
        assertEquals(hiero.discoverPyramidInSand("sand sand pyramid"), false);
        assertEquals(hiero.discoverPyramidInSand("pyramid sand sand"), false);
        assertEquals(hiero.discoverPyramidInSand("sand sand sand pyramid"), false);
        assertEquals(hiero.discoverPyramidInSand("sand pyramid sand"), true);
    }

    @Test
    public void containsAlphanumericGlyph() {
        assertEquals(hiero.readAlphanumericGlyph("1234abcd"), true);
        assertEquals(hiero.readAlphanumericGlyph("12345abcd"), false);
        assertEquals(hiero.readAlphanumericGlyph("6abcd"), false);
        assertEquals(hiero.readAlphanumericGlyph("1237abcdefg"), false);
        assertEquals(hiero.readAlphanumericGlyph("89xyz"), true);
    }

    @Test
    public void containsGoldScarab() {
        assertEquals(hiero.captureGoldScarab("scarab scarab scarab"), false);
        assertEquals(hiero.captureGoldScarab("gold scarab"), true);
        assertEquals(hiero.captureGoldScarab("scarab gold scarab"), true);
        assertEquals(hiero.captureGoldScarab("scarab scarab gold"), false);
        assertEquals(hiero.captureGoldScarab("gold"), false);
        assertEquals(hiero.captureGoldScarab("scarab"), false);
    }

    @Test
    public void doesNotContainCrocodile() {
        assertEquals(hiero.avoidNileCrocodile("nile"), true);
        assertEquals(hiero.avoidNileCrocodile("nile nile nile"), true);
        assertEquals(hiero.avoidNileCrocodile("nile crocodile"), false);
        assertEquals(hiero.avoidNileCrocodile("nile crocodile nile"), false);
        assertEquals(hiero.avoidNileCrocodile("nile nile crocodile"), false);
    }

    @Test
    public void stealFromTutsTomb() {
        List<String> loot = new ArrayList<>();

        loot = hiero.raidTutsTomb("gold incense sand artifacts");
        assert loot.contains("incense");
        assert loot.contains("gold");
        assert loot.contains("treasure");


    }


}
