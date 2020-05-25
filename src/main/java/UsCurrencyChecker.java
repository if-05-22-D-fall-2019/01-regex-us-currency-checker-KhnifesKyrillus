
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {

    private static String regex="\\$\\s?(\\d)+(\\.?\\d{1,2})?";
    private static Pattern pattern=Pattern.compile(regex);

    public static Matcher getMatcher(String usCurrencyString) {
        return pattern.matcher(usCurrencyString);
    }
}
