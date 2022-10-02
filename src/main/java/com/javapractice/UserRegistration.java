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
        log.info("Enter a valid first name");
		String firstName = sc.nextLine();
        log.info("Enter a valid first name");
		String lastName = sc.nextLine();
        log.info("Enter a valid email");
		String email = sc.nextLine();
        log.info("Enter a valid mobile number starting with country code followed by a space and 10 digit number");
		String mobile = sc.nextLine();
        log.info("Enter a valid password with minimum 8 charcters(at least one uppercase letter and one digit)");
		String password = sc.nextLine();
		validation(firstName,lastName,email,mobile,password);
        sc.close();
    }
    //method to validate form data
    public void validation(String firstName,String lastName,String email,String mobile,String password){
        // First Name and Last Name comes with restriction such as first letter should be upper case and with minimum 3 characters
        log.info("First Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        log.info("Last Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
        //  abc.xyz@bl.co.in is valid with abc bl and co are mandatory 2 optional(xyz,in) with precise @ and . positions 
        log.info("E-Mail valid: " + Pattern.matches("^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]{1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$", email));
        // country code followed by space followed by 10 digit number
        log.info("Mobile Number: " + Pattern.matches("^[1-9][0-9]*[\\s][6-9][0-9]{9}$", mobile));
        // minimum 8 characters required
		log.info("Password: " + Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$", password));
    }
    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
