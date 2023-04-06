
package AOO;

import java.util.Scanner;

public class Item {

    protected int value;
    protected String creator;

    public Item() {
        value = 0;
        creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Input a value (>=0): ");
                value = sc.nextInt();
                if (value > 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a number!");
            }

        }

        sc.nextLine();
        while (true) {
            System.out.print("Input a creator (not empty): ");
            creator = sc.nextLine();
            if (!creator.isEmpty()) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "value: " + value + "\ncreator: " + creator;
    }

}

