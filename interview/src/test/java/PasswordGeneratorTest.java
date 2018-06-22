import org.junit.Test;

public class PasswordGeneratorTest {

    @Test
    public void assertPasswordLength() {
        String password = PasswordGenerator.generatePassword();
        assert password.length() == 10;
    }


    @Test
    public void assertPasswordComplexity() {
        String password = PasswordGenerator.generatePassword();

        assert Character.isLetter(password.charAt(0));
        assert Character.isLetter(password.charAt(1));
        assert Character.isLetter(password.charAt(2));
        assert Character.isLetter(password.charAt(3));
        assert Character.isLetter(password.charAt(4));

        assert Character.isDigit(password.charAt(5));
        assert Character.isDigit(password.charAt(6));
        assert Character.isDigit(password.charAt(7));
        assert Character.isDigit(password.charAt(8));

        assert !Character.isLetterOrDigit(password.charAt(9));

    }

    @Test
    public void assertPasswordUnique() {
        // Note! ensuring uniqueness is a bit more complicated than what this test expects.
        // You should aim to randomize your passwords, knowing that there is a small chance that they may collide.
        // We will overlook incredibly unlucky collisions for now. :)

        String password1 = PasswordGenerator.generatePassword();
        String password2 = PasswordGenerator.generatePassword();

        assert !password1.equals(password2);
    }
}
