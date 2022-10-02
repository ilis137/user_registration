package com.javapractice;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration 
{
    private static final Logger log = LogManager.getLogger(UserRegistration.class);
    static Scanner sc = new Scanner(System.in);

    //asks users for the details to validate
    public void fillForm(){
        String firstName = "Amit";
        String lastName = "Maharana";
        String email = "abc.xyz@gmail.com";
        String mobile = "91 8210029078";
        String password = "Ahjgsd45@fj";
        this.isFirstNamevalid(firstName);
        this.isLastNameValid(lastName);
        this.isEmailValid(email);
        this.isMobileNumberValid(mobile);
        this.isPasswordValid(password);
      
    }
    //method to validate form data
    public boolean isFirstNamevalid(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName);
    }
    public boolean isLastNameValid(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName);
    }
    public boolean isEmailValid(String email) {
        return Pattern.matches("^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$", email);
    }
    public boolean isMobileNumberValid(String mobile) {
        return Pattern.matches("^[9][1][\\s][6-9][0-9]{9}$", mobile);
    }
    public boolean isPasswordValid(String password) {
        return Pattern.matches("^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$", password);
    }
    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
