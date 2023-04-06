package DTO;
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
      super();
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

    public void inputStatue() {
      Scanner scanner = new Scanner(System.in);
      super.input();
      System.out.println("Enter the weight of the statue: ");
      int weight = scanner.nextInt();
      while (weight <= 0) {
         System.out.println("Invalid weight. Please enter a positive integer: ");
         weight = scanner.nextInt();
      }
      setWeight(weight);
      
      scanner.nextLine();
      
      System.out.println("Enter the colour of the statue: ");
      String colour = scanner.nextLine();
      while (colour.isEmpty()) {
         System.out.println("Invalid colour. Please enter a non-empty string: ");
         colour = scanner.nextLine();
      }
      setColour(colour);
   }
   
   public void outputStatue() {
      super.output();
      System.out.println("Weight: " + weight);
      System.out.println("Colour: " + colour);
   }
}
