
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;  
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so sinh vien n=");
        n=Integer.parseInt(sc.nextLine());
        Student s[]=new Student[100];    
        String code,name,address;
        int year;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien "+(i+1));
            System.out.print("Code=");
            code= sc.nextLine();
            System.out.print("Ten=");
            name=sc.nextLine();
            System.out.print("Nam sinh=");
            year=Integer.parseInt(sc.nextLine());
            System.out.print("Dia chi=");
            address=sc.nextLine();
            s[i]=new Student(code, name, year, address);
        }
        //in ra
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
