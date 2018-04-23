import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz myFizzBuzz= new FizzBuzz();

    @Test
    public void testFizzBuzz() {
        assertEquals(myFizzBuzz.fizzBuzz(3), "fizz");
        assertEquals(myFizzBuzz.fizzBuzz(5), "buzz");
        assertEquals(myFizzBuzz.fizzBuzz(15), "fizzbuzz");
    }
}
