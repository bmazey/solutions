import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz myFizzBuzz= new FizzBuzz();

    @Test
    public void testFizzBuzzMultipleOfThree() {
        assertEquals(myFizzBuzz.fizzBuzz(231), "fizz");
        // add more cases?
    }

    @Test
    public void testFizzBuzzMultipleOfFive() {
        assertEquals(myFizzBuzz.fizzBuzz(440), "buzz");
        // add more cases?
    }

    @Test
    public void testFizzBuzzMultipleOfThreeAndFive() {
        assertEquals(myFizzBuzz.fizzBuzz(101640), "fizzbuzz");
        // add more cases?
    }
}
