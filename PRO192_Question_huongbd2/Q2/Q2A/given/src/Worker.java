/**
 *
 * @author CuongSchmidt
 **/
import java.util.Scanner;
public class Worker {
    String name;
    int age;
    
    public Worker(){

    }
    public Worker(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
