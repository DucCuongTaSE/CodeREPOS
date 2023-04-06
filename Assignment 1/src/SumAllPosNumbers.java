/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class SumAllPosNumbers {
    public static void main(String[] args){
        int n, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer: ");
        n = sc.nextInt();
        sum=0;
        for (int i=1; i<=n; i++){
            sum=sum+i;
        }
        System.out.println("Sum of integers from 1 to "+n+" : "+sum);
    }
}
