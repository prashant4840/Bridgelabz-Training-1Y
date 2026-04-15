import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternExample {
    public static void main(String[] args) {

        String regexp = "^[A-Za-z0-9]+@[a-z]+\\.com$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher("user@gmail.com");

        if (matcher.find()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}

