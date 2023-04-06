
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class InputIntPrimeBetween {
    public static void main(String[] args){
        int n;
        System.out.println("Input an integer: ");
        n = inputAnInteger();
        System.out.println("The primes from 1 to "+n+":");
        for (int i=2; i<=n; i++){
            if (isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    //------------------------------------------------
    private static int inputAnInteger(){
        Scanner sc = new Scanner(System.in);
        return(sc.nextInt());
    }
    //------------------------------------------------
    private static boolean isPrime(int n){
        boolean check = true;
        for (int i=2; i<n && check==true; i++){
            if(n%i==0){
                check = false;
            }
        }
        return check;
    }
}
