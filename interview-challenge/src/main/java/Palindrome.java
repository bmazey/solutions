public class Palindrome {

    /**
     * Welcome to the Interview Challenge!
     * @param args
     */

    public static void main(String [] args) {

    }

    public boolean isPalindrone (String s) {
        String r = new StringBuilder(s).reverse().toString();
        if (s.equals(r)) return true;
        else return false;
    }
}
