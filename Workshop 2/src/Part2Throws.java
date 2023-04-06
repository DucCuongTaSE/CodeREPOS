
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;

public class Part2Throws {
    public String inputString() throws Exception {
        String pattern = "^[0-9A-Za-z]*[A-Za-z]*[0-9]*[0-9A-Za-z]*[#?!@$%^&*]$";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter data: ");
        s = sc.nextLine();
        if (!s.matches(pattern))
            throw new Exception();
        return s;
    }

    public static void main(String[] args) throws Exception {
        Part2Throws obj = new Part2Throws();
        boolean cont = false;
        do {
            try {
                String s = obj.inputString();
                System.out.println("The string is: " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid.");
                cont = true;
            }
        } while (cont);
    }
}
