
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;

public class Part2TryCatch {
    public static void main(String[] args) {
        boolean cont = false;
        do {
            try {
                String s = "";
                String pattern;
                pattern = "^[0-9A-Za-z]*[A-Za-z]*[0-9]*[0-9A-Za-z]*[#?!@$%^&*]$";
                Scanner sc = new Scanner(System.in);
                System.out.println("Please type in your password: ");
                s = sc.nextLine();
                if (!s.matches(pattern))
                    throw new Exception();
                System.out.println("Password entered is: " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("Password pattern is invalid.");
                cont = true;
            }
        } while (cont);
    }
}
