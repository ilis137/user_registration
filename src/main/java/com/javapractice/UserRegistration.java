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
		validation(firstName,lastName);
        sc.close();
    }
 
    public void validation(String firstName,String lastName){
        log.info("First Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
        log.info("Last Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", lastName));
    }
    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
