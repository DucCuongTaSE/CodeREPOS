/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.Hospital;
import controller.Validation;
import java.text.ParseException;

/**
 *
 * @author bravee06
 */

public class UI {
    private static final Validation vl = new Validation();
    private Hospital hos = new Hospital();
    
    public void displayMenu() {
        System.out.println("\nHospital Management Program");
        System.out.println("---------------------------");
        System.out.println("1. Nurse's management");
        System.out.println("\t1.1 Create a nurse");
        System.out.println("\t1.2 Find the nurse");
        System.out.println("\t1.3 Update the nurse");
        System.out.println("\t1.4 Delete the nurse");
        System.out.println("2. Patient's management");
        System.out.println("\t2.1 Add a patient");
        System.out.println("\t2.2 Display patients");
        System.out.println("\t2.3 Sort the patients list");
        System.out.println("\t2.4 Save data");
        System.out.println("\t2.5 Load data");
        System.out.println("3. Quit");
    }
    public void handleMenuChoice(int choice) throws ParseException {
        switch (choice) {
            case 1:
                handleNurseManagement();
                break;
            case 2:
                handlePatientManagement();
                break;
            case 3:
                handleQuit();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
        private void handleNurseManagement() throws ParseException {
        
        while (true) {
            System.out.println("\nNurse's management");
            System.out.println("------------------");
            System.out.println("1. Create a nurse");
            System.out.println("2. Find the nurse");
            System.out.println("3. Update the nurse");
            System.out.println("4. Delete the nurse");
            System.out.println("5. Back to main menu");
            int choice = vl.inputInt("Enter your choice: ", 1, 5);
            switch (choice) {
                case 1:
                    hos.addNurse();
                    break;
                case 2:
                    hos.findNurse();
                    break;
                case 3:
                    hos.updateNurse();
                    break;
                case 4:
                    hos.deleteNurse();
                    break;
                case 5:
                    displayMenu();
                    int choice1 = vl.inputInt("Enter your choice", 0, 3);
                    handleMenuChoice(choice1);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    public void handlePatientManagement() throws ParseException {
        
        while (true) {
            System.out.println("\nPatient's management");
            System.out.println("--------------------");
            System.out.println("1. Add a patient");
            System.out.println("2. Display patients");
            System.out.println("3. Sort the patients list");
            System.out.println("4. Save data");
            System.out.println("5. Load data");
            System.out.println("6. Back to main menu");
            int choice = vl.inputInt("Enter your choice: ", 1, 6);
            switch (choice) {
                case 1:
                    hos.addPatient();
                    break;
                case 2:
                    hos.displayPatients();
                    break;
                case 3:
                    hos.sortPatients();
                    break;
                case 4:
                    hos.saveData();
                    break;
                case 5:
                    hos.loadData();
                    break;
                case 6:
                     displayMenu();
                    int choice1 = vl.inputInt("Enter your choice", 0, 3);
                    handleMenuChoice(choice1);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void handleQuit(){
        hos.quit();
    }
}

