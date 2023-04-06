/**
 *
 * @author CuongSchmidt
 */
import java.util.Scanner;
public class CalculateAreaAndPerimeter {

    public static void main(String[] args) {
        int arr;
        int n, choice;
        int length, width;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("====Do you want to calculate the area and the perimeter of?====");
            System.out.println("====                      1. Rectangle                     ====");
            System.out.println("====                      2. Triangle                      ====");
            System.out.println("====                      3. Circle                        ====");
            System.out.println("====                      4. Square                        ====");
            System.out.println("====                   0. Exit program!                    ====");
            System.out.println("====               Your selection (0 -> 4):                ====");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Thank you and have a nice day!");
                break;
            }
            switch (choice) {
                case 1:
                 System.out.println("Enter the length of a Rectangle: \n");
                 length = sc.nextInt();
                 System.out.println("Enter the width of the Rectangle: \n");
                 width = sc.nextInt();
                 arr = length * width;
                 System.out.println("Area of the Rectangle is " + arr + "\n");
                 arr = length + width + length + width;
                 System.out.println("Perimeter of the Rectangle is " + arr + "\n");
                    break;
                case 2:
                    double a,b,c,P,S,A;
                    sc = new Scanner(System.in);
                    System.out.println("Enter three sides of the triangle: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    if (a + b > c && a + c > b && b + c > a){
                    P = a + b + c;
                    System.out.format("Perimeter of the Triangle is: %.2f\n", P);
                    S = (a + b + c)/2;
                    System.out.format("Semi-perimeter of the Triangle is: %.2f\n", S);
                    A = Math.sqrt(S*(S-a)*(S-b)*(S-c));
                    System.out.format("Area of the Triangle is: %.2f\n", A);
                    } else {
                        System.out.format("Values are not from a triangle!");
                    }
                    break;
                case 3:
                    double radius, perimeter, area;
                    System.out.println("Enter the radius of the circle: ");
                    radius = sc.nextDouble();
                    perimeter = 2 * Math.PI * radius;
                    System.out.println("Perimeter of the circle is: " + perimeter);
                    area = Math.PI * radius * radius;
                    System.out.println("Area of the circle is: " + area);
                    break;
                case 4:
                    float Side, Peri, Area;
                    System.out.println("Enter the Side Length of the square: ");
                    Side = sc.nextFloat();
                    Area = 4*Side;
                    System.out.println("Area of the sqaure is: " + Area);
                    Peri = 4*Side;
                    System.out.println("Perimeter of the square is: " + Peri);
                    break;
            }
        }
        System.out.println();
    }
}

  
