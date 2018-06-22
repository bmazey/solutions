import java.util.Random;

public class PasswordGenerator {

    public static void main (String [] args) {

        // for testing!
        System.out.println("password: " + generatePassword());

    }

    public static String generatePassword() {

        Random r = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*";

        String password = "";

        for (int i = 0; i < 5; i++) {
            password += alphabet.charAt(r.nextInt(alphabet.length()));
        }

        for (int k = 0; k < 4; k ++) {
            password += numbers.charAt(r.nextInt(numbers.length()));
        }

        password += symbols.charAt(r.nextInt(symbols.length()));
        return password;
    }
}
