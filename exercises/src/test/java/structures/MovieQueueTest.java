package structures;

import org.junit.Test;

import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.core.IsEqual.equalTo;

public class MovieQueueTest {

    private MovieQueue myMovieQueue = new MovieQueue();

    @Test
    public void checkFirstInLine() {
        Queue<String> myQueue = myMovieQueue.createMovieQueue();
        assertThat(myQueue.peek(), equalToIgnoringCase("Leonardo"));
    }

    @Test
    public void checkSecondInLine() {
        Queue<String> myQueue = myMovieQueue.createMovieQueue();
        myQueue.remove();
        assertThat(myQueue.peek(), equalToIgnoringCase("Donatello"));
    }

    @Test
    public void checkQueueOrder() {
        Queue<String> myQueue = myMovieQueue.createMovieQueue();
        myQueue.remove();
        myQueue.remove();
        assertThat(myQueue.peek(), equalToIgnoringCase("Raphael"));
        myQueue.remove();
        assertThat(myQueue.peek(), equalToIgnoringCase("Michelangelo"));

    }

    @Test
    public void checkQueueSize() {
        Queue<String> myQueue = myMovieQueue.createMovieQueue();
        assertThat(myQueue.size(), equalTo(4));
    }
}
