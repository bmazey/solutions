package algorithms;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class PlagiarismTest {

    @Test
    public void assertIsPlagiarism() {
        String pat = "It was the best of times, it was the worst of times, it was the age of wisdom, " +
                "it was the age of foolishness";
        String txt = "It was the best of times, it was the worst of times, it was the age of wisdom, " +
                "it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, " +
                "it was the season of Light, it was the season of Darkness, it was the spring of hope, it was " +
                "the winter of despair, we had everything before us, we had nothing before us, we were all going " +
                "direct to Heaven, we were all going direct the other way—in short, the period was so far like " +
                "the present period, that some of its noisiest authorities insisted on its being received, for " +
                "good or for evil, in the superlative degree of comparison only.";

        ArrayList<Integer> matches = RabinKarp.search(pat, txt, 101);
        assertThat(matches.size(), equalTo(1));
        assertThat(matches.get(0), equalTo(0));
    }

    @Test
    public void assertIsNotPlagiarism() {
        String pat ="Two households, both alike in dignity " +
                "In fair Verona, where we lay our scene " +
                "From ancient grudge break to new mutiny " +
                "Where civil blood makes civil hands unclean.";
        String txt = "From forth the fatal loins of these two foes " +
                "A pair of star-cross'd lovers take their life " +
                "Whose misadventured piteous overthrows " +
                "Do with their death bury their parents' strife.";

        ArrayList<Integer> matches = RabinKarp.search(pat, txt, 101);
        assertThat(matches.isEmpty(), equalTo(true));
    }

    @Test
    public void assertIsAlsoPlagiarism() {
        String pat ="It is impossible. We live, as we dream-alone...";
        String txt = "It seems to me I am trying to tell you a dream--making a vain attempt, because no relation of " +
                "a dream can convey the dream-sensation, that commingling of absurdity, surprise, and bewilderment " +
                "in a tremor of struggling revolt, that notion of being captured by the incredible which is of the " +
                "very essence of dreams...No, it is impossible; it is impossible to convey the life-sensation of any " +
                "given epoch of one's existence--that which makes its truth, its meaning--its subtle and penetrating " +
                "essence. It is impossible. We live, as we dream-alone...";

        ArrayList<Integer> matches = RabinKarp.search(pat, txt, 101);
        assertThat(matches.size(), equalTo(1));
        assertThat(matches.get(0), equalTo(499));
    }
}
