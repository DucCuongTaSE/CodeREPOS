package GUI;
/**
 *
 * @author CuongSchmidt
 **/

import java.util.Scanner;
public class Menu {
    public static int getChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }
        System.out.print("Choose 1..." + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}