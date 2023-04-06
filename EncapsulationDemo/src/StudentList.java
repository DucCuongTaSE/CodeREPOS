
import java.util.Scanner;

public class StudentList {
    Student s[];  
    int n;   
    final int MAX=100;

    public StudentList() {
        s=new Student[100];        
    }
    
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("How much students are there: ");
        n=Integer.parseInt(sc.nextLine());
        String code,name,address;
        int year;
        for (int i = 0; i < n; i++) {
            System.out.println("Input student's data: "+(i+1));
            System.out.print("Code: ");
            code= sc.nextLine();
            System.out.print("Name: ");
            name=sc.nextLine();
            System.out.print("Birthday: ");
            year=Integer.parseInt(sc.nextLine());
            System.out.print("Address: ");
            address=sc.nextLine();
            s[i]=new Student(code, name, year, address);
        }
    }
    public void output(){
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
    
    //Search by name
    public Student searchByName(String name) {
    for (int i = 0; i < n; i++) {
        if (s[i].getName().equals(name)) {
            return s[i];
        }
    }
    return null;
}

    //Search by code
    public Student searchByCode(String code) {
    for (int i = 0; i < n; i++) {
        if (s[i].getCode().equals(code)) {
            return s[i];
        }
    }
    return null;
}

    //Delete by name
    public void deleteByName(String name) {
    for (int i = 0; i < n; i++) {
        if (s[i].getName().equals(name)) {
            for (int j = i; j < n - 1; j++) {
                s[j] = s[j + 1];
            }
            n--;
            break;
        }
    }
}

    //Delete by code
    public void deleteByCode(String code) {
    for (int i = 0; i < n; i++) {
        if (s[i].getCode().equals(code)) {
            for (int j = i; j < n - 1; j++) {
                s[j] = s[j + 1];
            }
            n--;
            break;
        }
    }
}

    //Sort by name
    public void sortByName() {
    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (s[j].getName().compareTo(s[minIndex].getName()) < 0) {
                minIndex = j;
            }
        }
        Student temp = s[minIndex];
        s[minIndex] = s[i];
        s[i] = temp;
    }
}

}
