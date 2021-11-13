import java.util.regex.*;
public class regexTest {
    public static void main(String[] args) {
        String firstName="Kunal";
        String lastName="Batham";
        String email="abc.xyx@bl.co.in";
        String mobileNumber="91 91";
        String password="Kunal123@w";


        String regexName="^[A-Z]{1}[a-z]{2}[a-z]*";
        String regexEmail="[a-zA-Z]+[a-zA-Z0-9]*[.]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
        String regexMobileNumber="[1-9]{2}[ \\S\\s]{1}+[1-9]*]";
        String regexPassword="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";


        System.out.println(firstName.matches(regexName));
        System.out.println(lastName.matches(regexName));
        System.out.println(email.matches(regexEmail));
        System.out.println(mobileNumber.matches(regexMobileNumber));
        System.out.println(password.matches(regexPassword));

    }
}
