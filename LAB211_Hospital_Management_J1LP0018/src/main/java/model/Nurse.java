/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bravee06
 */
public class Nurse extends Person implements Serializable{
   private String staffID;
   private String department;
   private String shift;
   private double salary;
   private ArrayList<Patient> patients;

   

    public Nurse(String staffID, String department, String shift, double salary, String name, int age, String gender, String address, String phone) {
        super(name, age, gender, address, phone);
        this.staffID = staffID;
        this.department = department;
        this.shift = shift;
        this.salary = salary;
    }

    public Nurse() {
    }
   
    
    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Nurse{" + "staffID=" + staffID + ", department=" + department + ", shift=" + shift + ", salary=" + salary + ", patients=" + patients + '}';
    }
         
    
    
    
}
