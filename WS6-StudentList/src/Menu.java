/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static int getChoice(ArrayList<String> options) {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + "-" + options.get(i));
        }
        System.out.print("Choose 1.." + options.size() + ": ");

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= options.size()) {
                    validChoice = true;
                } else {
                    System.out.print("Invalid choice. Choose 1.." + options.size() + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid choice. Choose 1.." + options.size() + ": ");
            }
        }

        return choice;
    }

    public static int getChoice(Object[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }
        System.out.print("Choose 1..." + options.length + ": ");

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= options.length) {
                    validChoice = true;
                } else {
                    System.out.print("Invalid choice. Choose 1..." + options.length + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid choice. Choose 1..." + options.length + ": ");
            }
        }

        return choice;
    }

    public static int getChoice(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "-" + options[i]);
        }
        System.out.print("Choose 1..." + options.length + ": ");

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice >= 1 && choice <= options.length) {
                    validChoice = true;
                } else {
                    System.out.print("Invalid choice. Choose 1..." + options.length + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid choice. Choose 1..." + options.length + ": ");
            }
        }

        return choice;
    }
}
