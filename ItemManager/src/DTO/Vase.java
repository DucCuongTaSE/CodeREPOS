package DTO;
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
        //null
    }

    public Vase(int height, String material, int value, String creator) {
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

       public void inputVase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        setValue(sc.nextInt());
        System.out.print("Enter the creator: ");
        setCreator(sc.next());
        System.out.print("Enter the height: ");
        setHeight(sc.nextInt());
        System.out.print("Enter the material: ");
        setMaterial(sc.next());
    }

    public void outputVase() {
        System.out.println("Value: " + getValue());
        System.out.println("Creator: " + getCreator());
        System.out.println("Height: " + getHeight());
        System.out.println("Material: " + getMaterial());
    }
}