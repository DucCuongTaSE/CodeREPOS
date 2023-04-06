/**
 *
 * @author CuongSchmidt
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class readfile {

    public static void main(String[] args) throws IOException {
        String path = "C:\\adb\\demo.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option: ");
        System.out.println("1. Write to file.");
        System.out.println("2. Read from file.");
        System.out.println("3. Print file information.");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                // Write to file
                System.out.println("Enter text to write to file: ");
                scanner.nextLine(); // Consume new line character
                String text = scanner.nextLine();
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(text);
                writer.close();
                System.out.println("Text written to file successfully.");
                break;

            case 2:
                // Read from file
                if (file.isFile()) {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();
                } else {
                    System.out.println("The specified file does not exist or is a directory.");
                }
                break;

            case 3:
                // Print file information
                if (file.isFile()) {
                    System.out.println("File name: " + file.getName());
                    System.out.println("Permanent file name: " + file.getAbsoluteFile());
                    System.out.println("Permanent file path: " + file.getAbsolutePath());
                    System.out.println("Accurate path is: " + file.getCanonicalPath());
                    System.out.println("Last update: " + new Date(file.lastModified()));
                    System.out.println("Hidden attributes: " + file.isHidden());
                    System.out.println("Readable: " + file.canRead());
                    System.out.println("Writable: " + file.canWrite());
                    System.out.println("Size: " + file.length() + " Bytes");
                } else {
                    System.out.println("The specified file does not exist or is a directory.");
                }
                break;

            default:
                System.out.println("Invalid option. Please choose option 1, 2 or 3.");
        }

        scanner.close();
    }
}
