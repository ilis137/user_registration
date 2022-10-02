package com.javapractice;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration 
{
    private static final Logger log = LogManager.getLogger(UserRegistration.class);
    static Scanner sc = new Scanner(System.in);

    public void fillForm(){
        log.info("Enter a valid first name");
		String firstName = sc.nextLine();
        log.info("Enter a valid first name");
		String lastName = sc.nextLine();
        System.out.println("Enter a valid email");
		String email = sc.nextLine();
        System.out.println("Enter a valid mobile number starting with country code followed by a space and 10 digit number");
		String mobile = sc.nextLine();
		validation(firstName,lastName,email,mobile);
        sc.close();
    }
 
    public void validation(String firstName,String lastName,String email,String mobile){
        log.info("First Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        log.info("Last Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
        log.info("E-Mail valid: " + Pattern.matches("^[a-zA-Z0-9]{3,}([.]{1}+[a-zA-Z0-9]{3,})*[@]{1}[a-zA-Z0-9]{2,}[.]{1}[a-zA-Z0-9]{2,}([.]{1}[a-zA-Z0-9]{2,})*$", email));
        log.info("Mobile Number: " + Pattern.matches("^[1-9][0-9]*[\\s][6-9][0-9]{9}$", mobile));
    }
    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
