import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordPattern {
    public static void main(String[] args) {

        String regexp = "^[A-Za-z0-9@#$%&!]{8,16}$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("Prashant@1234");

        if (matcher.matches()) {
            System.out.println("valid password");
        } else {
            System.out.println("invalid password");
        }
    }
}