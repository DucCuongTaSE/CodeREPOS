
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class PrimeOrNotPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input an integer: ");
        n = sc.nextInt();
        if (isPrime(n)==true){
            System.out.println(n+" is a prime");
        }
        else {
            System.out.println(n+" is not a prime");
        }
    }
    //-----------------------------------------------
    private static boolean isPrime(int n){
        boolean check = true;
        for (int i=2; i<n && check == true; i++){
            if (n%i==0){
                check = false;
            }
        }
        return check;
    }
}
