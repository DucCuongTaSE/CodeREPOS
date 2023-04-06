


/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;
public class stringdemonetbeanver {

public static void main(String[] args)
    { 
        System.out.println("Please enter a name: ");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String s1=new String();
        s=s.trim();
        int k;
        for(k=s.length()-1;k>=0;k--)
        {
            s1=s.substring(k,k+1);
            if(s1.equals(" ")) break;
        }
        System.out.println("First Name: "+ s.substring(k+1));
        int i;
        for(i=0;i<=s.length();i++)
        {
           s1=s.substring(i,i+1);
            if(s1.equals(" ")) break;
        }
        System.out.println("Middle Name: "+ s.substring(0,i));
        int j = 0;
    
        if(j>i&&j<k)
        {
            s1=s.substring(j,j+1);
        }
        System.out.println("Last Name: "+s.substring(i+1,k));
    
    }
}