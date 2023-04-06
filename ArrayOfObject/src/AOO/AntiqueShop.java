
package AOO;

import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ItemList obj = new ItemList();
        OUTER:
        do {
            System.out.println("1. Add a new vase");
            System.out.println("2. Add a new statue");
            System.out.println("3. Add a new painting");
            System.out.println("4. Display all items");
            System.out.println("5. Find the items by the creator ");
            System.out.println("6. Update the item by its index");
            System.out.println("7. Remove the item by its index");
            System.out.println("8. Display the list of vase items ");
            System.out.println("9. Sorts items in ascending order based on their values ");
            System.out.println("10. Exit");
            System.out.println("Input your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Item vase = new Vase();
                    vase.input();
                    if (obj.addItem(vase)) {
                        System.out.println("added");
                    }
                    break;
                case 2:
                    Item statue = new Statue();
                    statue.input();
                    if (obj.addItem(statue)) {
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item painting = new Painting();
                    painting.input();
                    if (obj.addItem(painting)) {
                        System.out.println("added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    System.out.println("displayed");
                    break;
                case 5:
                    System.out.print("Input a creator: ");
                    sc.nextLine();
                    String creator = sc.nextLine();
                    System.out.println(obj.findItem(creator));
                    break;
                case 6:
                    System.out.print("Input a index: ");
                    int index = sc.nextInt();
                    if (obj.updateItem(index)) {
                        System.out.println("updated");
                    } else {
                        System.out.println("cannot update");
                    }
                    break;
                case 7:
                    System.out.print("Input a index: ");
                    index = sc.nextInt();
                    if (obj.removeItem(index)) {
                        System.out.println("removed");
                    } else {
                        System.out.println("cannot remove");
                    }
                    break;
                case 8:
                    obj.displayItemsByType("Vase");
                    System.out.println("displayed vase items");
                    break;
                case 9:
                    obj.sortItems();
                    System.out.println("sorted");
                    break;
                case 10:
                    break OUTER;
            }

        } while (choice <= 9);
    }
}
