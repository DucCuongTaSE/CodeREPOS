package DTO;
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class Painting extends Item {
    private int height;
    private int width;
    boolean isWatercolour;
    boolean isFramed;
    
    public Painting() {
        super();
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

    public void inputPainting() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        setValue(sc.nextInt());
        System.out.print("Enter the creator: ");
        setCreator(sc.next());
        System.out.print("Enter the height: ");
        setHeight(sc.nextInt());
        System.out.print("Enter the width: ");
        setWidth(sc.nextInt());
        System.out.print("Is it a watercolour? (true/false): ");
        setWatercolour(sc.nextBoolean());
        System.out.print("Is it framed? (true/false): ");
        setFramed(sc.nextBoolean());
    }

    public void outputPainting() {
        System.out.println("Value: " + getValue());
        System.out.println("Creator: " + getCreator());
        System.out.println("Height: " + getHeight());
        System.out.println("Width: " + getWidth());
        System.out.println("Watercolour: " + isWatercolour());
        System.out.println("Framed: " + isFramed());
    }
}
    
    

