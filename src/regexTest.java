import java.util.regex.*;
public class regexTest {
    public static void main(String[] args) {
        String firstName="Kunal";
        String lastName="Batham";
        String regex="^[A-Z]{1}[a-z]{2}[a-z]*";

        System.out.println(firstName.matches(regex));
        System.out.println(lastName.matches(regex));
    }
}
