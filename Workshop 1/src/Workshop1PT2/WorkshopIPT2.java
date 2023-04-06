package Workshop1PT2;

/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class WorkshopIPT2 {
    public static void main(String[] args){
        float num1,num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        num1=sc.nextFloat();
        System.out.println("Input the second number: ");
        num2=sc.nextFloat();
        System.out.println("Input the operator: ");
        sc=new Scanner(System.in);
        op = sc.nextLine();
        if( op.equals("+")){
            System.out.println("the result of "+num1+op+num2+"="+(num1+num2));
        if( op.equals("-")){
            System.out.println("the result of "+num1+op+num2+"="+(num1-num2));
        if( op.equals("*")){
            System.out.println("the result of "+num1+op+num2+"="+(num1*num2));
        if( op.equals("/")){
            System.out.println("the result of "+num1+op+num2+"="+(num1/num2));
                    }
                }
            }
        }
    }
}