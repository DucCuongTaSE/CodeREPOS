/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;
public class CheckNegAndPos {
    public static void main(String[] args) {
       int n;
       char c;
       System.out.println("Input an integer: ");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       if ( n >= 0){
           System.out.println("This is a positive integer");
       } else {
           System.out.println("This is a negative integer");
       }
    }
}
