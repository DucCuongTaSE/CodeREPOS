
package AOO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        height = 0;
        width = 0;
        isWatercolour = false;
        isFramed = false;
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        while (true) {
            try {
                System.out.print("Input a height (>=0 and <=2000): ");
                height = sc.nextInt();
                if (height >= 0 && height <= 2000) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a number!");
            }
        }
        while (true) {
            try {
                System.out.print("Input a width (>=0 and <=3000): ");
                width = sc.nextInt();
                if (width >= 0 && width <= 3000) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a number!");
            }
        }

        System.out.print("Enter isWatercolour: ");
        isWatercolour = sc.nextBoolean();
        System.out.println("Enter isFramed: ");
        isFramed = sc.nextBoolean();
    }

    @Override
    public String toString() {
        return super.toString() + "\nheight: " + height + "\nwidth: " + width
                + "\nisWatercolour: " + isWatercolour + "\nisFramed: " + isFramed;
    }

}
