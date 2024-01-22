package com.example.iqsc;

public class Users {

    String ID,Aided_SFS,Department,Salutation,Name,Designation,Gender,PAN,AADHAR,Contact_email_id,Contact_Phone_number,Date_of_Birth,Age_as_of_July_2023;

    public Users() {
    }

    public Users(String ID, String aided_SFS, String department, String salutation, String name, String designation, String gender, String PAN, String AADHAR, String contact_email_id, String contact_Phone_number, String date_of_Birth, String age_as_of_July_2023) {
        this.ID = ID;
        Aided_SFS = aided_SFS;
        Department = department;
        Salutation = salutation;
        Name = name;
        Designation = designation;
        Gender = gender;
        this.PAN = PAN;
        this.AADHAR = AADHAR;
        Contact_email_id = contact_email_id;
        Contact_Phone_number = contact_Phone_number;
        Date_of_Birth = date_of_Birth;
        Age_as_of_July_2023 = age_as_of_July_2023;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAided_SFS() {
        return Aided_SFS;
    }

    public void setAided_SFS(String aided_SFS) {
        Aided_SFS = aided_SFS;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getAADHAR() {
        return AADHAR;
    }

    public void setAADHAR(String AADHAR) {
        this.AADHAR = AADHAR;
    }

    public String getContact_email_id() {
        return Contact_email_id;
    }

    public void setContact_email_id(String contact_email_id) {
        Contact_email_id = contact_email_id;
    }

    public String getContact_Phone_number() {
        return Contact_Phone_number;
    }

    public void setContact_Phone_number(String contact_Phone_number) {
        Contact_Phone_number = contact_Phone_number;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String date_of_Birth) {
        Date_of_Birth = date_of_Birth;
    }

    public String getAge_as_of_July_2023() {
        return Age_as_of_July_2023;
    }

    public void setAge_as_of_July_2023(String age_as_of_July_2023) {
        Age_as_of_July_2023 = age_as_of_July_2023;
    }
}
