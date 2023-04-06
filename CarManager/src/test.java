/**
 *
 * @author CuongSchmidt
 **/

public class test {
    public static void main(String[] args){
        carmanager c = new carmanager();
        c.pressStartButton();
        c.pressAcceleratorButton();
        c.output();
        
        carmanager c2 = new carmanager("red", 100, true, true);
        c2.pressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2: " + c2.getColour());
        c2.output();
    }
}
