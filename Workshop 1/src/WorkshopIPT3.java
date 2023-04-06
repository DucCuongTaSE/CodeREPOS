/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class WorkshopIPT3 {
    public static void main(String[] args){
        String[] list; 
        list = new String[3];
    for(int i=0;i<3;i++){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student number "+(i+1)+" :");
        list[i] = sc.nextLine();
        }
    for (int i=0; i<3; i++){
        char[] charArray = list[i].toCharArray();
        boolean foundSpace = true;
        for(int j=0; j<charArray.length; j++){
            if(Character.isLetter(charArray[j])){
                if(foundSpace){
                    charArray[j]=Character.toUpperCase(charArray[j]);
                    foundSpace=false;
                    }
                } else {
                 foundSpace = true;
                } 
            }
        list[i]=String.valueOf(charArray);
        System.out.println("After Upper: " + list[i]);
        }
    }  
}
