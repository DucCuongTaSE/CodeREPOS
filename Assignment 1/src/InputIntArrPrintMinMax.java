/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class InputIntArrPrintMinMax {
    public static void main(String[] args){
        int n;
        int[] intArray;
        float averageNum, maxNum, minNum;
        System.out.println("The number of elements of the array: ");
        n = inputInt();
        intArray = new int[n];
        averageNum=0;
        for (int i=0; i < n; i++){
            System.out.print("Array["+i+"]=");
            intArray[i] = inputInt();
            averageNum += intArray[i];
        }
        averageNum = averageNum/n;
        maxNum = minNum = intArray[0];
        for (int i = 1; i < n; i++){
            if(maxNum<intArray[i]){
                maxNum=intArray[i];
            }
            if(minNum>intArray[i]){
                minNum=intArray[i];
            }
        }
        System.out.println("The average number of the array = " + averageNum);
        System.out.println("The max number of the array = " + maxNum);
        System.out.println("The min number of the array = " + minNum);
    }
    //-------------------------------------------------
    private static int inputInt(){
        Scanner sc = new Scanner(System.in);
        return(sc.nextInt());
    }
}
