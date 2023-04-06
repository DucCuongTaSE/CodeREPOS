/**
 *
 * @author CuongSchmidt
 */
import java.io.FileWriter;

public class writedemo {

    public static void main(String[] args) {
        String path = "C:\\adb\\demo.txt";
        try{
            FileWriter fw=new FileWriter(path);
            fw.write("Hello world!\n");
            fw.write("This is a demo of write function in Java!");
            fw.close();
            System.out.println("Write successful!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
