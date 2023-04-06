/**
 *
 * @author CuongSchmidt
 **/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student {
    private final String code;
    private final String name;
    private final int age;
    
    public Student(String code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice = 0;

        while (choice != 4) {
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Sort the student by code");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of students: ");
                    int numStudents = scanner.nextInt();

                    for (int i = 0; i < numStudents; i++) {
                        System.out.println("## Enter information for student ##");
                        System.out.print("## Code: ");
                        String code = scanner.next();
                        System.out.print("## Name: ");
                        String name = scanner.next();
                        System.out.print("## Age: ");
                        int age = scanner.nextInt();
                        students.add(new Student(code, name, age));
                    }

                    String filePath = "C:\\adb\\demo.txt";
                    FileWriter fileWriter = new FileWriter(filePath);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    for (Student student : students) {
                        String line = student.getCode() + " , " + student.getName() + " , " + student.getAge();
                        bufferedWriter.write(line);
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.close();
                    System.out.println("Data written to file.");
                    break;

                case 2:
                    filePath = "C:\\adb\\demo.txt";
                    FileReader fileReader = new FileReader(filePath);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        String[] data = line.split(",");
                        Student student = new Student(data[0], data[1], Integer.parseInt(data[2]));
                        System.out.println("Code: " + student.getCode() + ", Name: " + student.getName() + ", Age: " + student.getAge());
                    }
                    bufferedReader.close();
                    break;
                
                case 3:
                    // Read the file
                    filePath = "C:\\adb\\demo.txt";
                    FileReader fileReader2 = new FileReader(filePath);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    List<Student> studentList = new ArrayList<>();
                    while ((line = bufferedReader2.readLine()) != null) {
                        String[] data = line.split(",");
                        Student student = new Student(data[0], data[1], Integer.parseInt(data[2]));
                        studentList.add(student);
                    }
                    bufferedReader2.close();

                    // Sort the students by code
                    Collections.sort(studentList, (Student s1, Student s2) -> s1.getCode().compareTo(s2.getCode()));

                    // Write the file
                    FileWriter fileWriter2 = new FileWriter(filePath);
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                    for (Student student : studentList) {
                        String line2 = student.getCode() + " , " + student.getName() + " , " + student.getAge();
                        bufferedWriter2.write(line2);
                        bufferedWriter2.newLine();
                    }
                    bufferedWriter2.close();
                    System.out.println("Students sorted by code and written to file.\n");
                    break;
                
               
                    
                case 4:
                    System.out.println("Exiting program.");
                    break;
                    
                 default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        }
        scanner.close();
    }
}