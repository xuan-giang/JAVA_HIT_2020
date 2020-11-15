package BAI1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunMain {
    public static void main(String[] args) {
        String regexUsername = "^[a-zA-Z0-9]{6,}$";
        String regexPassword = "^[0-9]{8,}$";

        Pattern patternUsername = Pattern.compile(regexUsername);
        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcher;

        String strUsername = "dsewdvdfvdf";
        String strPassword = "214412412";

        matcher = patternUsername.matcher(strUsername);
        System.out.println("Check username: " + matcher.find());
        matcher = patternPassword.matcher(strPassword);
        System.out.println("Check password: " + matcher.find());
    }
}
