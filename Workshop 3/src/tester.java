/**
 *
 * @author CuongSchmidt
 **/

public class tester {
    public static void main(String[] args){
        guitar obj1 = new guitar();
        guitar obj2 = new guitar("G123", 2000, "Sony", "Model123", "hardWood", "softwood");
        System.out.println("State of obj1: ");
        obj1.createSound();
        System.out.println("State of obj2: ");
        obj2.createSound();
        System.out.println("set price = 3000 of obj1");
        obj1.setPrice(3000);
        System.out.println("get price of obj1: " + obj1.getPrice());

    }
}
