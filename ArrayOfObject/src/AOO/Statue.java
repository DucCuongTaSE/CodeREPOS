
package AOO;

import java.util.Scanner;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
        weight = 0;
        colour = "";
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Input a weight (>=0 and <=1000): ");
                weight = sc.nextInt();
                if (weight >= 0 && weight <= 1000) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a number!");
            }
        }
        sc.nextLine();
        while (true) {
            System.out.print("Input a colour (not empty): ");
            colour = sc.nextLine();
            if (!colour.isEmpty()) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nweight: " + weight + "\ncolour: " + colour;
    }

}
