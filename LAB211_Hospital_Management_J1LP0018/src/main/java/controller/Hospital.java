/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.Nurse;
import model.Patient;

/**
 *
 * @author bravee06
 */

public class Hospital {
    // Create validation object to input data
    private static final Validation vl = new Validation();
    
    // Use map to manage patient and nurse list 
    private Map<String, Patient> lsPatient ;
    private Map<String, Nurse> lsNurse ;
    
    // Create iterator to check and access each of key,value of Map 
    private Iterator<Map.Entry<String,Nurse>> itr;
    private Iterator<Map.Entry<String,Patient>> itrP; 

    // Create SimpleDateFormat object to parse to Date to compare Date
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    // check data changed 
    private boolean dataChanged;
    
    // no count 
    int noCountPatient;
    int noCountNurse;
    // Contructor to set properties 
    public Hospital(){
        dataChanged = false;
        lsPatient = new HashMap<>();
        lsNurse = new HashMap<>();
        itr = lsNurse.entrySet().iterator();
        itrP = lsPatient.entrySet().iterator();
        noCountPatient =0;
        noCountNurse =0;
    }
    
    /*
    Function 1. Create a nurse – 50 LOC
− User is required inputting a nurse: staffID, name, age, gender, address, phone, department, shift,
salary.
− The system should check the valid data with the following conditions:
▪ All fields are not allowed null.
▪ The staffID field must be unique.
▪ The length of the department field must be from 3 to 50 characters.
▪ The import phone field must be a valid phone format.
▪ The age field must be a positive number.
▪ The salary field must be a positive number.
− Add the nurse to the collection of nurses.
− Ask to continue adding a new nurse or go back to the main menu.
    */
    public void addNurse(){
        
       while(true){
        // input data nurse 
        String staffID = vl.inputStaffID(lsNurse,"Enter staffID: ");
        String name = vl.inputString("Enter name: ");
        int age = vl.inputInt("Enter age: ", 0, 150);
        String gender = vl.inputString("Enter gender: ");
        String address = vl.inputString("Enter address: ");
        String phone = vl.inputPhone("Enter phone: ");
        String department = vl.inputDepartment("Enter department: ");
        String shift = vl.inputString("Enter shift: ");
        double salary = vl.inputDouble("Enter salary: ",0,1000000);
        
        // put nurse into map 
        Nurse newNurse = new Nurse(staffID,department,shift,salary,name,age,gender,address,phone);
        
        noCountNurse++;
        String noCount = Integer.toString(noCountNurse);
        lsNurse.put(noCount, newNurse);
        
        // asking user to want adding nurse 
        if(vl.inputString("Do you want adding a new nurse ( enter `Y` ) or back to the main menu ( enter `N` )").equalsIgnoreCase("y"))
               continue;
        else break;
       }
       
       // Update the iterator after adding a nurse
        itr = lsNurse.entrySet().iterator();

       // set changed value 
        dataChanged = true;
    }
    
    /*
    
   Function 2. Find a nurse – 50 LOC
− User is required inputting the nurse ‘s name or part of the name.
− If the nurse does not exist, the message “The nurse does not exist” is displayed. Otherwise, display the
nurse.
    
    */
    
    public void findNurse(){
      // input data partName 
      String partName = vl.inputString("Enter the part of name to find nurse: ").trim();
      
      // find nurse by part name in the list
       boolean foundNurse = false;
      // find nurse by part name in the list 
      while(itr.hasNext()){
        Map.Entry<String, Nurse> entry = itr.next();
        Nurse nurse = entry.getValue();
        if (nurse.getName().contains(partName)) {
            // if match print nurse object
            System.out.println(nurse);
            foundNurse = true;
        }
      }
      if (!foundNurse) {
        System.out.println("The nurse does not exist");
    }
        
    }
    
    /*
    
    Function 3. Update a nurse – 50 LOC
− User is required inputting the staffID.
− If the nurse does not exist, the message “The nurse does not exist” is displayed. Otherwise, the user
can edit the nurse.
− The application should show the result of the update: success or failure.
    
    */
    
    public Nurse findNurseByID(String staffID){
       // find nurse by staff id in the list
        itr = lsNurse.entrySet().iterator(); // Initialize the iterator
        // find nurse by staff id in the list
      while(itr.hasNext()){
        Map.Entry<String, Nurse> entry = itr.next();
        Nurse nurse = entry.getValue();
         
        if (nurse.getStaffID().equals(staffID)) {
            // if match print nurse object
           return nurse;
        }
      }
      return null;
    }
      
    public void updateNurse(){
        
        // input data staff id to update 
        String staffID = vl.inputString("Enter id nurse to update"); 
        
        // find nurse and return nurse by id 
        Nurse updateNurse = findNurseByID(staffID.trim());
        
        System.out.println(updateNurse);
        
        // use try catch to notify success or failure state
        try{
        // if update nurse is a object then update nurse 
        if(updateNurse != null){
        // remove old nurse object 
        lsNurse.remove(staffID);
        // input data nurse
        System.out.println("Staff exist. Now you can edit this staff: ");
        String name = vl.inputString("Enter name: ");
        int age = vl.inputInt("Enter age: ", 0, 150);
        String gender = vl.inputString("Enter gender: ");
        String address = vl.inputString("Enter address: ");
        String phone = vl.inputPhone("Enter phone: ");
        String department = vl.inputDepartment("Enter department: ");
        String shift = vl.inputString("Enter shift: ");
        double salary = vl.inputDouble("Enter salary: ",0,10000000);
        
          // put nurse into map 
        Nurse newNurse = new Nurse(staffID,department,shift,salary,name,age,gender,address,phone);
        noCountNurse++;
        String noCount = Integer.toString(noCountNurse);
        lsNurse.put(noCount, newNurse);
        
        
        // if not error print out success state 
        System.out.println("Success Updated !");
        
        // Update the iterator after adding a nurse
        itr = lsNurse.entrySet().iterator();
           
        // set changed value 
        dataChanged = true;
        
        // else print does not exist 
        }else{
            System.out.println("The nurse does not exist!");
        }
        // if match exception print failure state
    }catch(Exception e){
        System.out.println("Failure Updated !");
    }
        
    }
    
    /*
    
    Function 4. Delete a nurse – 50 LOC
− User is required inputting the staffID.
− If the nurse does not exist, the message “The nurse does not exist” is displayed. Otherwise, the user
can delete the nurse.
− The application must show the confirmation message before deleting.
− The nurse cannot be deleted if she has a task (look after a patient specification in below).
− The application should show the result of the deletion: success or failure
   
    */
    
    public void deleteNurse() {
    String staffID = vl.inputString("Enter the staff ID to delete the nurse: ");
    Nurse deleteNurse = findNurseByID(staffID);
    
    if (deleteNurse == null) {
        System.out.println("The nurse does not exist");
    } else {
        String optionUser = vl.inputString("Do you want to delete this nurse? (YES or NO) (Y or N): ");
        if (optionUser.equalsIgnoreCase("y")) {
            if (deleteNurse.getPatients() == null) {
                lsNurse.remove(deleteNurse.getStaffID());
                System.out.println("Success Delete!");
                // set changed value
                dataChanged = true;
            } else {
                System.out.println("This nurse is taking care of at least one patient.");
            }
        } else {
            System.out.println("Deletion Cancelled.");
        }
    }
}

    
    /*
    Function 5. Add a patient – 50 LOC
− The program requires user to input a piece of patient information including id, name, age, gender,
address, phone, diagnosis, admissionDate, dischargeDate, nurseAssigned.
− The system should check the valid data with the following conditions:
P a g e | 3
▪ All fields are not allowed null.
▪ The id fields must be unique.
▪ The admissionDate, dischargeDate fields must be a valid date format.
▪ The age field must be a positive integer.
▪ The import phone field must be a valid phone format.
▪ The nurseAssigned field must be on the list of available nurses.
− Add the patient to the collection of patients.
− Ask to continue adding a new patient or go back to the main menu.
    */
    
   public void addPatient() {
    while (true) {
        // input data patient
        String id = vl.inputStaffID(lsNurse, "Enter staffID: ");
        String name = vl.inputString("Enter name: ");
        int age = vl.inputInt("Enter age: ", 0, 150);
        String gender = vl.inputString("Enter gender: ");
        String address = vl.inputString("Enter address: ");
        String phone = vl.inputPhone("Enter phone: ");
        String diagnosis = vl.inputString("Enter diagnosis: ");
        String admissionDate = vl.inputDate("Enter admission date: ");
        String dischargeDate = vl.inputDate("Enter discharge date: ");
        ArrayList<Nurse> nurseAssigned = vl.inputNurse("Enter staff ID of nurse you want to assign: ", lsNurse);

        // put patient data
        noCountPatient++;
        String noCount = Integer.toString(noCountPatient);
        lsPatient.put(noCount, new Patient(id, diagnosis, admissionDate, dischargeDate, nurseAssigned, name, age, gender, address, phone));

        // set changed value
        dataChanged = true;

         // Update the iterator after adding a nurse
        itrP = lsPatient.entrySet().iterator();
           
        // asking user to add another patient
        if (!vl.inputString("Do you want to add another patient? (Y/N)").equalsIgnoreCase("y")) {
            break;
        }
    }
}

   
   /* 
   Function 6. Display patients – 50 LOC
− User is required inputting a start and end date.
− The application should show patients information based on typed date range below if applicable
(admission date).
   */
   
  public void displayPatients() throws ParseException {
    itrP = lsPatient.entrySet().iterator();
    String startDate = vl.inputDate("Enter start date");
    String endDate = vl.inputDate("Enter end date");

    Date start = sdf.parse(startDate);
    Date end = sdf.parse(endDate);
    System.out.println("LIST OF PATIENTS");
    System.out.printf("%-4s%-12s%-16s%-12s%-15s%-1s\n", "No.", "Patient Id", "Admission Date", "Full name", "Phone", "Diagnosis");
 
    while (itrP.hasNext()) {
       Map.Entry<String, Patient> entry = itrP.next();
       String noCount = entry.getKey();
       Patient p = entry.getValue();

        Date checkDate = sdf.parse(p.getAdmissionDate());

        if (checkDate.compareTo(start) >= 0 && checkDate.compareTo(end) <= 0) {
            System.out.printf("%-4s%-12s%-16s%-12s%-15s%-1s\n", noCount, p.getId(), p.getAdmissionDate(), p.getName(), p.getPhone(), p.getDiagnosis());
        }
    }
}

   /*
   Function 7. Sort patients – 50 LOC
− User is required inputting a sorted field (patient id or patient’s name) and the sort patient (ASC, DESC).
− The system will sort and display the collection of patients as below.
   */
  public void sortPatients() {
    
    itrP = lsPatient.entrySet().iterator();
    String field = vl.inputString("Enter the field to sort by (patient id or patient's name): ");
    String sortOrder = vl.inputString("Enter the sort order (ASC or DESC): ");

    Comparator<Patient> comparator = null;

    if (field.equalsIgnoreCase("patient id")) {
        comparator = Comparator.comparing(Patient::getId);
    } else if (field.equalsIgnoreCase("patient's name")) {
        comparator = Comparator.comparing(Patient::getName);
    } else {
        System.out.println("Invalid field!");
        return;
    }

    if (sortOrder.equalsIgnoreCase("asc")) {
        lsPatient.values().stream()
                .sorted(comparator)
                .forEach(System.out::println);
    } else if (sortOrder.equalsIgnoreCase("desc")) {
        lsPatient.values().stream()
                .sorted(comparator.reversed())
                .forEach(System.out::println);
    } else {
        System.out.println("Invalid sort order!");
    }
    
    System.out.println("LIST OF PATIENTS");
    System.out.printf("%-4s%-12s%-16s%-12s%-15s%-1s\n", "No.", "Patient Id", "Admission Date", "Full name", "Phone", "Diagnosis");
 
    while (itrP.hasNext()) {
       Map.Entry<String, Patient> entry = itrP.next();
       Patient p = entry.getValue();
       String noCount = entry.getKey();
       System.out.printf("%-4s%-12s%-16s%-12s%-15s%-1s\n", noCount, p.getId(), p.getAdmissionDate(), p.getName(), p.getPhone(), p.getDiagnosis());   
    }
      
}

//    public void sortPatients(){
//      // declear noCount variable to display index of list patient on table 
//      int noCount = 0; 
//      
//      itrP = lsPatient.entrySet().iterator();
//      
//      // print title table 
//      System.out.println("LIST OF PATIENTS");
//      
//      // input sortBy and sortOrder 
//      String sortBy = vl.inputDate("Sorted by: ");
//      String sortOrder = vl.inputDate("Sort order");
//      // use format printf same c to create table 
//      System.out.printf("%4s%8s%16s%11s%8s%19s\n", "No.", "Patient Id", "Admission Date", "Full name", "Phone", "Diagnosis");
//      
//      // Create array list to sort Patients by Collections class 
//      List<Patient> sortedPatients = new ArrayList<>();
//      
//      // access patient object over itrP Iterator object 
//      while(itrP.hasNext()){
//          // get patient over getValue method in itrP.next();
//          Patient p = itrP.next().getValue();
//          sortedPatients.add(p);
//      }
//      // Create a Comparator that compares patients by ID
//    Comparator<Patient> idComparator = new Comparator<Patient>() {
//    @Override
//    public int compare(Patient p1, Patient p2) {
//        // Compare patient IDs
//        return p1.getId().compareTo(p2.getId());
//    }
//     };
//      if(sortBy.equalsIgnoreCase("patient id"))
//      {
//          if (sortOrder.equalsIgnoreCase("asc")) 
//          {
//            Collections.sort(sortedPatients,idComparator);
//        } else if (sortOrder.equalsIgnoreCase("desc"))
//        {
//            Collections.sort(sortedPatients, Collections.reverseOrder(idComparator));
//        }
//      }
//        else if(sortBy.equalsIgnoreCase("patient's name"))
//        {
//          if (sortOrder.equalsIgnoreCase("asc")) {
//            Collections.sort(sortedPatients,idComparator);
//        } else if (sortOrder.equalsIgnoreCase("desc")) 
//        {
//            Collections.sort(sortedPatients, Collections.reverseOrder(idComparator));
//        }
//        }
//        else {
//            System.out.println("Invalid sort order. Please enter ASC or DESC.");
//            return;
//        }
//      
//      // display patient 
//      for(Patient p : sortedPatients)
//      {
//           // use format of printf method 
//             System.out.printf("%-4d%-12s%-16s%-12s%-15s%-1s\n",noCount, p.getId(), p.getAdmissionDate(), p.getName(), p.getPhone(), p.getDiagnosis());
//      }
//      }
//    
    /*
    Function 8. Save data – 50 LOC
− The application should save the collection of nurses to the binary file that is named as nurses.dat.
− The application should save the collection of patients to the binary file that is named as patients.dat.
    */
    public void saveData(){
    try {
        // save nurse data to nurses.dat file
        FileOutputStream fileOut = new FileOutputStream("nurses.dat");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(lsNurse);
        objectOut.close();
        fileOut.close();
        
        // save patient data to patients.dat file
        fileOut = new FileOutputStream("patients.dat");
        objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(lsPatient);
        objectOut.close();
        fileOut.close();
        
        System.out.println("Data saved successfully.");
    } catch (Exception e) {
        System.out.println("Error occurred while saving data: " + e.getMessage());
    }
    
    }
    
    

    /*
    Function 9. Load data – 50 LOC
− The application will load the collection of nurses from the nurses.dat file.
− The application will load the collection of patients from the patients.dat file.
    */
    
    public void loadData() {
        try {
            // Load nurses data from file
            FileInputStream fis = new FileInputStream("nurses.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lsNurse = (HashMap<String, Nurse>) ois.readObject();
            ois.close();
            fis.close();
            
            // Load patients data from file
            fis = new FileInputStream("patients.dat");
            ois = new ObjectInputStream(fis);
            lsPatient = (HashMap<String, Patient>) ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("Data loaded successfully.");
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

    /*
    Function 10. Quit – 50 LOC
− Exit the program.
− The application must show the confirmation message before exiting.
− The application must save data to files if data has changed.
    */
    public void quit() {
  // Check if data has changed
  
  // Ask for confirmation before exiting
  if (dataChanged) {
    System.out.println("There are unsaved changes. Do you want to save before exiting? (Y/N)");
    String input = vl.inputString("");
    if (input.equalsIgnoreCase("Y")) {
      saveData();
      System.out.println("Data saved successfully.");
    }
  }
  System.out.println("Are you sure you want to quit? (Y/N)");
  String input = vl.inputString("");
  if (input.equalsIgnoreCase("Y")) {
    System.out.println("Exiting the program...");
    System.exit(0);
  }
}


      
}
