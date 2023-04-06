/**
 *
 * @author CuongSchmidt
 **/
import java.time.Month;
import java.time.LocalDate;
import java.util.Scanner;
public class StringDateMonthYear{

    public static void getDayMonthYear(String date)
    {
 
        LocalDate currentDate
            = LocalDate.parse(date);

        int day = currentDate.getDayOfMonth();
 
        Month month = currentDate.getMonth();
 
        int year = currentDate.getYear();
 
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
 

    public static void main(String args[])
    {
        System.out.println("Please enter the date: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }
}