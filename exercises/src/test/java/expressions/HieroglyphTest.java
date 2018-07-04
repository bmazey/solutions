package expressions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HieroglyphTest {

    Hieroglyph hiero = new Hieroglyph();

    @Test
    public void containsSacredCats() {

        //all cats are sacred!

        assertEquals(hiero.worshipSacredCats("sacredcat"), true);
        assertEquals(hiero.worshipSacredCats("catsacredsacred"), true);
        assertEquals(hiero.worshipSacredCats("sacredsacredcat"), true);
        assertEquals(hiero.worshipSacredCats("sacred"), false);
        assertEquals(hiero.worshipSacredCats("cat"), true);
    }

    @Test
    public void containsPyramidInSand() {
        assertEquals(hiero.discoverPyramidInSand("sandsandsand"), false);
        assertEquals(hiero.discoverPyramidInSand("sandsandpyramid"), false);
        assertEquals(hiero.discoverPyramidInSand("pyramidsandsand"), false);
        assertEquals(hiero.discoverPyramidInSand("sandsandsandpyramid"), false);
        assertEquals(hiero.discoverPyramidInSand("sandpyramidsand"), true);
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
        assertEquals(hiero.captureGoldScarab("scarabscarabscarab"), false);
        assertEquals(hiero.captureGoldScarab("goldscarab"), true);
        assertEquals(hiero.captureGoldScarab("scarabgoldscarab"), true);
        assertEquals(hiero.captureGoldScarab("scarabscarabgold"), false);
        assertEquals(hiero.captureGoldScarab("gold"), false);
        assertEquals(hiero.captureGoldScarab("scarab"), false);
    }

    @Test
    public void doesNotContainCrocodile() {
        assertEquals(hiero.avoidNileCrocodile("nile"), true);
        assertEquals(hiero.avoidNileCrocodile("nilenilenile"), true);
        assertEquals(hiero.avoidNileCrocodile("nilecrocodile"), false);
        assertEquals(hiero.avoidNileCrocodile("nilecrocodilenile"), false);
        assertEquals(hiero.avoidNileCrocodile("nilenilecrocodile"), false);
    }


}
