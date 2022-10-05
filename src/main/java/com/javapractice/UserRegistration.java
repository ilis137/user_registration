package com.javapractice;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface UserEntryValidator {
    boolean validityCheck(String pattern, String name);
}
public class UserRegistration 
{
    private static final Logger log = LogManager.getLogger(UserRegistration.class);
     Scanner sc = new Scanner(System.in);
     String NAME_PATTERN = "^[A-Z]{1}[a-zA-Z]{2,}$";
     String EMAIL_PATTERN = "^[a-zA-Z0-9]{3,}([\\.\\+\\-]?[a-zA-Z0-9]{3,})?[@][A-Za-z0-9]{1,}[.][A-Za-z]{2,4}[,]?([.][A-Za-z]{2,4}[.]?)?$";
     String MOBILE_NUMBER_PATTERN = "^[9][1]\\s[6-9][0-9]{9}$";
     String PASSWORD_PATTERN = "^(?=.*[\\@\\#\\$\\%\\&\\_\\,\\.\\!])(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z]).{8,}$";
    
     UserEntryValidator validate = (String pattern, String name) -> Pattern.matches(pattern, name);
    //asks users for the details to validate
    public void fillForm(){
        log.info("Enter a valid first name");
		String firstName = sc.nextLine();
        log.info("Enter a valid last name");
		String lastName = sc.nextLine();
        log.info("Enter a valid email");
		String email = sc.nextLine();
        log.info("Enter a valid mobile number starting with country code followed by a space and 10 digit number");
		String mobile = sc.nextLine();
        log.info("Enter a valid password with minimum 8 charcters(at least one uppercase letter,one digit and exactly one special character)");
		String password = sc.nextLine();
        System.out.println("Entered First Name is " + validate.validityCheck(NAME_PATTERN, firstName));
        System.out.println("Entered Last Name is " + validate.validityCheck(NAME_PATTERN, lastName));
        System.out.println("Entered Email is " + validate.validityCheck(EMAIL_PATTERN, email));
        System.out.println("Entered Mobile Number is " + validate.validityCheck(MOBILE_NUMBER_PATTERN, mobile));
        System.out.println("Entered Password is " + validate.validityCheck(PASSWORD_PATTERN, password));      
    }
    

    public static void main( String[] args )
    {
        UserRegistration form=new UserRegistration();
        System.out.println("Welcome to User Registration Program");
        form.fillForm();
    }
}
