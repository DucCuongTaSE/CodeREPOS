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
public class Patient extends Person implements Serializable{
    private String id;
    private String diagnosis;
    private String admissionDate;
    private String dischargeDate;
    private ArrayList<Nurse> nurseAssigned;

    public Patient(String id, String diagnosis, String admissionDate, String dischargeDate, ArrayList<Nurse> nurseAssigned, String name, int age, String gender, String address, String phone) {
        super(name, age, gender, address, phone);
        this.id = id;
        this.diagnosis = diagnosis;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.nurseAssigned = nurseAssigned;
    }

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public ArrayList<Nurse> getNurseAssigned() {
        return nurseAssigned;
    }

    public void setNurseAssigned(ArrayList<Nurse> nurseAssigned) {
        this.nurseAssigned = nurseAssigned;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", diagnosis=" + diagnosis + ", admissionDate=" + admissionDate + ", dischargeDate=" + dischargeDate + ", nurseAssigned=" + nurseAssigned + '}';
    }

    
    
}
