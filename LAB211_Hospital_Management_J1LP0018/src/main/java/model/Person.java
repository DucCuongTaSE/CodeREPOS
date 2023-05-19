/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author bravee06
 */
public class Person implements Serializable{
    // khai bao cac properties cua person class 
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    // ham dung khong tham so
    public Person(){
        
    }
    
    // ham dung co tham so
    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    
    // Getter and Setter cac properties can dc secure

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    // ghi de phuong thuc toString to Person Object 

    @Override
    public String toString() {
        return "{ Person } : " + "Name : " + name ;
    }
    
            
    
}
