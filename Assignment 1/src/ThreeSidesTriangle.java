/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class ThreeSidesTriangle {
    public static void main(String[] args){
        float a, b, c;
        System.out.println("Input 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("These numbers are 3 sides of a triangle!");
        else
            System.out.println("These numbers are not 3 sides of a triangle!");
    }
}
