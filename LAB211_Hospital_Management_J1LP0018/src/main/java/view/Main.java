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
public class Main {
    private static final Validation vl = new Validation();
    public static void main(String[] args) throws ParseException {
        UI ui = new UI();
        ui.displayMenu();
        int choice = vl.inputInt("Enter your choice", 0, 3);
        ui.handleMenuChoice(choice);
    }
}
