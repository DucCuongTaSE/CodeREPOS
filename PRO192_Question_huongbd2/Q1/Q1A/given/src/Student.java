/**
 *
 * @author CuongSchmidt
 **/
public class Student {
    private String name;
    private int age;
    
    public Student() {
        name = "";
        age = 0;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name.toUpperCase();
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

