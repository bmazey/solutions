package patterns;

import org.junit.Test;
import patterns.singleton.SingleLady;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SingletonTest {

    SingleLady singleLady = SingleLady.getInstance();

    @Test
    public void allTheSingleLadies() {
        String originalAddress = singleLady.toString();
        String secondAddress = singleLady.getInstance().toString();

        assertThat(originalAddress, equalTo(secondAddress));
    }

}
