import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;

    public final String ACCOUNT_EXAMPLE= "[a-z0-9_]{6,}";

    public boolean validate(String regex) {
        pattern = Pattern.compile(ACCOUNT_EXAMPLE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
