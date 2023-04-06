
package AOO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase() {
        height = 0;
        material = "";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Input a height (>=0 and <= 2000): ");
                height = sc.nextInt();
                if (height >= 0 && height <= 2000) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a number!");
            }
        }

        sc.nextLine();
        while (true) {
            System.out.print("Input a material (not empty): ");
            material = sc.nextLine();
            if (!material.isEmpty()) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nheight: " + height + "\nmaterial: " + material;
    }

}
