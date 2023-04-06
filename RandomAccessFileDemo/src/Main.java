
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        String filename;
        filename = "matrix.txt";
        MyMatrix g = new MyMatrix();
        try {
            g.loadFromFile(filename);
        } catch (IOException e) {
        }
        g.display();
        System.out.println();
    }

}
