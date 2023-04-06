/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;
public class arrayinteger {
    public int a[];
    public int n;
    private final int MaxSize = 100;
    
    public static void main(String[] args) {
        arrayinteger temp = new arrayinteger();
        temp.IntegerInput();
        temp.IntegerShow();
    }
    
    public void arrayinteger(){
       a = new int[MaxSize];
    }
    
    public void IntegerInsert(){
        int insert = a[0];
        
    }
    
    public void IntegerRemove(){
        
    }
    
    public void IntegerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input n: ");
        n = sc.nextInt();
        a = new int[n];
        while (n < 1 || n > MaxSize) {
            System.out.println("Wrong expression! Please input again: ");
            n = sc.nextInt();
        }
        System.out.println("Please input positive numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void IntegerShow() {
        System.out.println("Numbers of Even: " + EvenInteger());
        System.out.println("Numbers of Odd: " + OddInteger());
        System.out.println("Max number is: " + MaxInteger());
        System.out.println("Min number is: " + MinInteger());
        System.out.println("Sum of all integers: " + SumInteger());
    }

    public int EvenInteger() {
        int count = 0;
        for (int pt : a) {
            if (pt % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int OddInteger() {
        int count = 0;
        for (int pt : a) {
            if (pt % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int MaxInteger() {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int MinInteger() {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public int SumInteger() {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}

