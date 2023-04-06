/**
 *
 * @author CuongSchmidt
 */
public class studentlist {
    private String code;
    private String name;
    private int age;
    
    public studentlist(String code, String name, int age) {
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
        // Create a list of students
        Student[] students = {
            new Student("001", "John", 18),
            new Student("002", "Mary", 20),
            new Student("003", "Bob", 19)
        };
        
        // Write students' info to file
        String filePath = "students.txt";
        FileWriter fileWriter = new FileWriter(filePath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : students) {
            String line = student.getCode() + "," + student.getName() + "," + student.getAge();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        
        // Read students' info from file and print to screen
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(",");
            Student student = new Student(data[0], data[1], Integer.parseInt(data[2]));
            System.out.println("Code: " + student.getCode() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
        bufferedReader.close();
    }
}