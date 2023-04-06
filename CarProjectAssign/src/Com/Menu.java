package Com;
/**
 *
 * @author CuongSchmidt
 **/
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int response;
    private final Scanner scanner = new Scanner (System.in);
    
   
    public int int_getChoice (ArrayList <String> options) {
        options.forEach((i) -> {
            System.out.println(i);
        });
        System.out.print("Please choose an option 0..12: ");
        response = scanner.nextInt();
        return response;
    }

    
    public int int_getChoice (BrandList brand) {
        int n = brand.size();
        for (int i = 0; i < n; i++) {
            System.out.println("" + (i+1) + ". " + brand.get(i));
        }
        System.out.print("Please choose an option 1..12: ");
        response = scanner.nextInt();
        return response;
    }

    //Get user choice as an object in the list
    public Brand ref_getChoice (BrandList options) {
        int N = options.size();
        System.out.println("Brand ID List:");
        do {
            response = int_getChoice(options);
        } while ((response < 0) || (response > N));
        return options.get(response - 1);
    }
}

