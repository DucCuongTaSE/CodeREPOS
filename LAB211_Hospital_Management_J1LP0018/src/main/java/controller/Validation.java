/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Nurse;
import model.Patient;

/**
 *
 * @author bravee06
 */
public class Validation {
    private final Scanner sc = new Scanner(System.in);
    
    private Iterator<Map.Entry<String,Nurse>> itr;
    
    // get non-empty string 
    public String inputString(String msg)
    {
       
        String rs = "";
        while(true)
        {
            System.out.println(msg);
            rs = sc.nextLine();
            if(rs == "") System.out.println("Not allowed null please input again");
            else break;
        }
        return rs;
    }
    
    public String inputStaffID(Map<String,Nurse> ls,String msg)
    {
      String rs = "";
      while(true)
      {
      int count = 0;
      rs = inputString(msg);
      Iterator<Entry<String,Nurse>> itr = ls.entrySet().iterator();
      while(itr.hasNext()){
          if(itr.next().getValue().getStaffID().equals(rs)){
              System.out.println("Staff ID existed !! Please input again");
              count++;
              break;
          }
      }
      if(count == 0) return rs;
      }
      
    }
    
    public String inputID(Map<String,Patient> ls,String msg)
    {
      String rs = "";
      while(true)
      {
      int count = 0;
      rs = inputString(msg);
      Iterator<Entry<String,Patient>> itr = ls.entrySet().iterator();
      while(itr.hasNext()){
          if(itr.next().getValue().getId().equals(rs)){
              System.out.println(" ID existed !! Please input again");
              count++;
              break;
          }
      }
      if(count == 0) return rs;
      }
      
    }
      
    public String inputDepartment(String msg)
    {
        String rs = "";
        while(true)
        {
             rs = inputString(msg);
             int lengthDepartment = rs.length();
             if(lengthDepartment< 3 || lengthDepartment >50)
             {
                 System.out.println("Must be 3 to 50 characters");
             }
             else break;
        }
        return rs;
    }
    public String inputPhone(String msg)
    {
        String rs = "";
        while(true)
        {
             rs = inputString(msg);
             int lengthPhone = rs.length();
             
             if(lengthPhone < 10 || lengthPhone >11)
             {
                 System.out.println("Phone must be 10 to 11 numbers");
             }
             
             else break;
        }
        return rs;
    }
    // The age field must be a positive number.
    
    public int inputInt(String msg, int min, int max){
        System.out.println(msg);
        while(true)
        {
              String rs_raw = sc.nextLine();
              try{
                 int rs = Integer.parseInt(rs_raw);
                 if(rs<min || rs > max) 
                 {
                     System.out.println("This number must be " + min + " to " + max);
                     continue;
                 }
                 return rs;
              }catch(NumberFormatException e){
                  System.out.println("This must be number ");
                  
              }
             
        }
    }
    
    // The salary field must be a positive number.
    
    public double inputDouble(String msg, double min, double max){
        System.out.println(msg);
        while(true)
        {
              String rs_raw = sc.nextLine();
              try{
                 double rs = Double.parseDouble(rs_raw);
                 if(rs<min || rs > max) 
                 {
                     System.out.println("This number must be " + min + " to " + max);
                     continue;
                     
                 }
                 return rs;
              }catch(NumberFormatException e){
                  System.out.println("This must be number ");
              }
             
        }
    }
    
    // ▪ The admissionDate, dischargeDate fields must be a valid date format.
    
    public String inputDate(String msg)
    {
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        String date = "";
       
        while(true){
            date = inputString(msg);
            Matcher matcher = pattern.matcher(date);
            if(!matcher.matches()){
                System.out.println("The format date incorrect");
                continue;
            }
            return date;
        }
    }
   public Nurse findNurseByID(String staffID, Map<String, Nurse> ls) {
    Iterator<Map.Entry<String, Nurse>> itr = ls.entrySet().iterator();
    while (itr.hasNext()) {
        Map.Entry<String, Nurse> entry = itr.next();
        if (entry.getValue().getStaffID().equals(staffID)) {
            return entry.getValue();
        }
    }
    return null;
}

// The nurseAssigned field must be on the list of available nurses.
public ArrayList<Nurse> inputNurse(String msg, Map<String, Nurse> ls) {
    ArrayList<Nurse> nurseAss = new ArrayList<>();
    int count = 0;
    while (count < 2) {
        String staffID = inputString(msg);
        Nurse findNurse = findNurseByID(staffID, ls);
        if (findNurse != null) {
            nurseAss.add(findNurse);
            count++;
        } else {
            System.out.println("Nurse is not in the list! Please try again!");
        }
    }
    return nurseAss;
}

       
    
    
        
        
    
    
     
    

        
    
    
}
