package DTO;
/**
 *
 * @author CuongSchmidt
 **/

import java.util.Scanner;
public class Item {
    protected int value;
    protected String creator;

    public Item(){
        //null 
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
   public void input() {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a value for the item (must be greater than 0): ");
                int value = sc.nextInt();
                if (value > 0) {
                    this.value = value;
                    break;
                } else {
                    System.out.println("Invalid value. Please enter a value greater than 0.");
                }
            }
            
            sc.nextLine();
            
            while (true) {
                System.out.print("Enter the creator of the item: ");
                String creator = sc.nextLine();
                if (!creator.isEmpty()) {
                    this.creator = creator;
                    break;
                } else {
                    System.out.println("Creator cannot be empty. Please enter a valid creator.");
                }
            }
        }
    }

    void output() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

