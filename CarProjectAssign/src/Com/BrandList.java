package Com;
/**
 *
 * @author CuongSchmidt
 **/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BrandList extends ArrayList <Brand> {
    private String brandID, brandName, soundBrand;
    private double price;
    private int pos;
    Scanner scanner = new Scanner(System.in);
    PrintWriter pw;
    BufferedReader br;

   public boolean loadFromFile (String fileName) throws IOException{
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                if (fields.length != 4) {
                    System.out.println("Invalid data: " + line);
                    continue;
                }
                String id = fields[0];
                String name = fields[1];
                String manufacturer = fields[2];
                double price;
                try {
                    price = Double.parseDouble(fields[3]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price: " + fields[3] + " in data: " + line);
                    continue;
                }
                if (id.isEmpty() || name.isEmpty() || manufacturer.isEmpty() || price < 0) {
                    System.out.println("Invalid data: " + line);
                    continue;
                }
                Brand brand = new Brand(id, name, manufacturer, price);
                this.add(brand);
            }
            scanner.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return false;
        }
    }
   
    public boolean saveToFile (String fileName) {
        try {
            pw = new PrintWriter(new FileWriter(fileName));
            this.forEach((i) -> {
                pw.println(i);
            });
            pw.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }

    
    public int searchID (String bID) {
        for (int i = 0; i < this.size(); i++) {
            if (bID.equals(this.get(i).getBrandID())) {
                return i;
            }
        }
        return -1;
    }

   
    public Brand getUserChoice () {
        Menu menu = new Menu();
        return (Brand) menu. ref_getChoice(this);
    }

   
    public void addBrand () {
        boolean checkBrandID = false;
        //System.out.println("Test: " + this.get(2).getBrandID());
        do {
            System.out.print("Input brand ID: ");
            brandID = scanner.nextLine();
            for (Brand aThi : this) {
                if (brandID.equals(aThi.getBrandID())) {
                    checkBrandID = true;
                    System.out.println("This brand ID is existed. Try another one!");
                    break;
                } else {
                    checkBrandID = false;
                }
            }
        } while (checkBrandID == true);
        do {
            System.out.print("Input brand name: ");
            brandName = scanner.nextLine();
            if (brandName.equals("") != true) {
                break;
            }
            System.out.println("The brand name must not be null. Try again!");
        } while (true);
        do {
            System.out.print("Input sound brand: ");
            soundBrand = scanner.nextLine();
            if (soundBrand.equals("") != true) {
                break;
            }
            System.out.println("The sound brand must not be null. Try again!");
        } while (true);
        do {
            System.out.print("Input price: ");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price <= 0) {
                    System.out.println("The price must not be null. Try again!");
                }
            } catch (NumberFormatException e) {
                System.out.println("The price must be a number. Try again!");
                price = 0;
            }
        } while (price == 0);
        this.add(new Brand(brandID, brandName, soundBrand, price));
        System.out.println("Brand has added successfully!");
    }

    //Update brand_name, sound_brand, price of an existed brand
    public void updateBrand () {
        do {
            System.out.print("Input brand ID: ");
            brandID = scanner.nextLine();
            pos = searchID (brandID);
            if (pos != -1) {
                break;
            }
            System.out.println("Not found!");
        } while (true);
        do {
            System.out.print("Input brand name: ");
            brandName = scanner.nextLine();
            if (brandName.equals("") != true) {
                break;
            }
            System.out.println("The brand name must not be null. Try again!");
        } while (true);
        do {
            System.out.print("Input sound brand: ");
            soundBrand = scanner.nextLine();
            if (soundBrand.equals("") != true) {
                break;
            }
            System.out.println("The sound brand must not be null. Try again !");
        } while (true);
        do {
            System.out.print("Input price: ");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price <= 0) {
                    System.out.println("The price must not be null. Try again !");
                    price = 0;
                }
            } catch (NumberFormatException e) {
                System.out.println("The price must be a number. Try again !");
                price = 0;
            }
        } while (price == 0);
        this.get(pos).setUpdatedBrand(brandName, soundBrand, price);
        System.out.println("Brand has updated successfully!");
    }

    //Show the list of the brands
    public void listBrands() {
        this.forEach((aThi) -> {
            System.out.println(aThi);
        });
    }
}