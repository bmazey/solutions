public class FizzBuzz {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public String fizzBuzz(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) return "fizzbuzz";
        else if (i % 3 == 0 ) return "fizz";
        else if (i % 5 == 0 ) return "buzz";
        else return "";
    }
}
