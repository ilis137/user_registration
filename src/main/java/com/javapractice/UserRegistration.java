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
        System.out.println("Enter a valid first name");
		String firstName = sc.nextLine();
		validation(firstName);
    }
 
    public void validation(String firstName){
        System.out.println("First Name Valid: " + Pattern.matches("^[A-Z]{1}[a-zA-Z]{2,}$", firstName));
    }
    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
