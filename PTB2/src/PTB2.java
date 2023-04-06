/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;
public class PTB2 {
    
   public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a (a khác 0): ");
        a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        c = scanner.nextDouble();
        System.out.println("Phương trình bậc hai bạn vừa nhập có dạng: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm!");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
        }
    }
}