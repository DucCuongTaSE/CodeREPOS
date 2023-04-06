package Com;
/**
 *
 * @author CuongSchmidt
 **/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CarList extends ArrayList <Car> {
    private String carID, color, frameID, engineID;
    private Brand brand;
    Menu menu = new Menu();
    Scanner scanner = new Scanner (System.in);
    BrandList brandList;
    BufferedReader br;
    String line;
    String [] arr;
    
    //Initialize a list based on the existed brand list
    public CarList (BrandList bList) {
        brandList = bList;
    }

    public boolean loadFromFile (String fileName) throws IOException {
        try {
            br = new BufferedReader(new FileReader(fileName));
            line = br.readLine();
            while (line != null) {
                arr = line.split(",");
                carID = arr[0].trim();
                brand = brandList.get(brandList.searchID(arr[1].trim()));
                color = arr[2].trim();
                frameID = arr[3].trim();
                engineID = arr[4].trim();
                this.add(new Car(carID, brand, color, frameID, engineID));
                line = br.readLine();
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
        return false;
    }

    
    public boolean saveToFile (String fileName) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter (fileName));
            this.forEach((i) -> {
                pw.println(i);
            });
            pw.close();
            return true;
        } catch (IOException e) {
        }
        return false;
    }

   
    public int searchID (String carID) {
        for (int i = 0; i < this.size(); i++) {
            if (carID.equals(this.get(i).getCarID())) {
                return i;
            }
        }
        return -1;
    }
    
    
    private int searchEngineID(String searchEngineID) {
        for (int i = 0; i < this.size(); i++) {
            if (searchEngineID.equals(this.get(i).getEngineID())) {
                return i;
            }
        }
        return -1;
    }

    
    private int searchFrameID(String searchFrameID) {
        for (int i = 0; i < this.size(); i++) {
            if (searchFrameID.equals(this.get(i).getFrameID())) {
                return i;
            }
        }
        return -1;
    }


    public void addCar () {
        boolean checkCarID = false;
        do {
            System.out.print("Input car ID: ");
            carID = scanner.nextLine();
            for (Car aThi : this) {
                if (carID.equals(aThi.getCarID())) {
                    checkCarID = true;
                    System.out.println("This car ID is existed. Try another one!");
                    break;
                } else {
                    checkCarID = false;
                }
            }
        } while (checkCarID == true);

        
        Brand Brand = menu.ref_getChoice(brandList);
            
        do {
            System.out.print("Input color: ");
            color = scanner.nextLine();
            if (color.equals("") != true) {
                break;
            }
            System.out.println("The color must not be null. Try again !");
        } while (true);
        do {
            System.out.print("Input frame ID: ");
            frameID = scanner.nextLine();
            if ((frameID.matches("F[0-9][0-9][0-9][0-9][0-9]")) && (searchFrameID(frameID) == -1)) {
                break;
            }
            System.out.println("The frame ID must be in F00000 format and not be duplicated. Try again !");
        } while (true);
        do {
            System.out.print("Input engine ID: ");
            engineID = scanner.nextLine();
            if ((engineID.matches("E[0-9][0-9][0-9][0-9][0-9]")) && (searchEngineID(engineID) == -1)) {
                break;
            }
            System.out.println("The engine ID must be in E00000 format and not be duplicated. Try again !");
        } while (true);
        this.add(new Car(carID, Brand, color, frameID, engineID));
        System.out.println("Car has added successfully !");
    }


      public void printBasedBrandName() {
        String aPartOfBrandName;
        int count = 0;
        System.out.println("Input brand name: ");
        aPartOfBrandName = scanner.nextLine();
        count = this.stream().filter((aThi) -> (aThi.brand.getBrandName().contains(aPartOfBrandName))).map((aThi) -> {
            System.out.println(aThi.screenString());
            return aThi;
        }).map((_item) -> 1).reduce(count, Integer::sum);
        if (count == 0) {
            System.out.println("No car is detected !");
        }
    }



    public boolean removeCar() {
        int pos;
        String removedID;
        System.out.print("Input car ID to removed: ");
        removedID = scanner.nextLine();
        pos = searchID(removedID);
        if (pos >= 0) {
            this.remove(pos);
            return true;
        }
        return false;
    }

    
    public boolean updateCar () {
        int pos;
        String updatedID;
        System.out.print("Input car ID to updated: ");
        updatedID = scanner.nextLine();
        pos = searchID(updatedID);
        if (pos >= 0) {
            Brand Brand = menu.ref_getChoice(brandList);
            
            do {
                System.out.print("Input color: ");
                color = scanner.nextLine();
                if (color.equals("") != true) {
                    break;
                } else {
                }
                System.out.println("The color must not be null. Try again !");
            } while (true);
            do {
                System.out.print("Input frame ID: ");
                frameID = scanner.nextLine();
                if ((frameID.matches("F[0-9][0-9][0-9][0-9]")) && (searchFrameID(frameID) == -1)) {
                    break;
                }
                System.out.println("The frame ID must be in F0000 format and not be duplicated. Try again !");
            } while (true);
            do {
                System.out.print("Input engine ID: ");
                engineID = scanner.nextLine();
                if ((engineID.matches("E[0-9][0-9][0-9][0-9]")) && (searchEngineID(engineID) == -1)) {
                    break;
                }
                System.out.println("The engine ID must be in E0000 format and not be duplicated. Try again !");
            } while (true);
            this.get(pos).setUpdatedCar (Brand, color, frameID, engineID);
            return true;
        } else {
            System.out.println("Car ID not existed !");
        }
        return false;
    }

   
    public void listCars () {
        Collections.sort(this);
        this.forEach((i) -> {
            System.out.println(i.toString());
        });
    }
}