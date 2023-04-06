
/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;

public class exception1 {

    static void Example() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println("The number is: " + num);
    }

    static int Example2(int n) {
        int f = 1;
        for (int i = 1; i <= f; i++) {
            f = f * i;
        }
        return f;
    }

    static int Example3(int n) {
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                n = n * i;
            }
        }
        else {    
            System.out.println("Error!");
            System.exit(1);
        }
        return n;
    }
    public static void main(String[] args){
        System.out.println(Example3(-5));
    }
}
