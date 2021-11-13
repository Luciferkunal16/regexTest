import java.util.regex.*;
public class regexTest {
    public static void main(String[] args) {
        String firstName="Kunal";
        String lastName="Batham";
        String email="abc.xyx@bl.co.in";
        String regexName="^[A-Z]{1}[a-z]{2}[a-z]*";
        String regexEmail="[a-zA-Z]+[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";


        System.out.println(firstName.matches(regexName));
        System.out.println(lastName.matches(regexName));
        System.out.println(email.matches(regexEmail));
    }
}
