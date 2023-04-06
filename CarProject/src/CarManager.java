
/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;

public class CarManager {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String BRAND_FILE = "D:\\Documents\\PRO192-AssignmentDemo\\brands.txt";
    private static final String CAR_FILE = "D:\\Documents\\PRO192-AssignmentDemo\\cars.txt";

    public static BrandList brandList;
    public static CarList carList;

    public static void main(String[] args) {
        brandList = new BrandList();
        if (!brandList.loadFromFile(BRAND_FILE)) {
            System.out.println("Error loading brand data from file.");
        }

        carList = new CarList(brandList);
        if (!carList.loadFromFile(CAR_FILE)) {
            System.out.println("Error loading car data from file.");
        }

        while (true) {
            System.out.println("Please choose an operation:");
            System.out.println("1- List all brands");
            System.out.println("2- Add a new brand");
            System.out.println("3- Search a brand based on its ID");
            System.out.println("4- Update a brand");
            System.out.println("5- Save brands to the file, named brands.txt");
            System.out.println("6- List all cars in ascending order of brand names");
            System.out.println("7- List cars based on a part of an input brand name");
            System.out.println("8- Add a car");
            System.out.println("9- Remove a car based on its ID");
            System.out.println("10- Update a car based on its ID");
            System.out.println("11- Save cars to a file, named cars.txt");
            System.out.println("0- Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    brandList.listBrands();
                    break;
                case 2:
                    brandList.addBrand();
                    break;
                case 3:
                    brandList.searchBrand();
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    if (brandList.saveToFile(BRAND_FILE)) {
                        System.out.println("Brand data saved to file successfully.");
                    } else {
                        System.out.println("Error saving brand data to file.");
                    }
                    break;
                case 6:
                    carList.listCars();
                    break;
                case 7:
                    carList.listCarsByBrandKeyword();
                    break;
                case 8:
                    carList.addCar();
                    break;
                case 9:
                    carList.removeCar();
                    break;
                case 10:
                    carList.updateCar();
                    break;
                case 11:
                    if (carList.saveToFile(CAR_FILE)) {
                        System.out.println("Car data saved to file successfully.");
                    } else {
                        System.out.println("Error saving car data to file.");
                    }
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
