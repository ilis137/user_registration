package com.javapractice;


import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;


public class UserRegistrationTest {
    static UserRegistration form = new UserRegistration();
    private static final Logger log = LogManager.getLogger(UserRegistration.class);
    
    @Test
    public void checkGivenFirstNameIsValidSouldRetuenTrue() { // Check if the pattern works for valid name
        try {
        Assert.assertEquals(true, form.isFirstNamevalid("Iliyas"));
            
        } catch (Exception e) {
            // TODO: handle exception
          log.info("exception occured is "+e);
        }
    }
    @Test
    public void checkGivenFirstNameIsInvalidForlessThan3Characters() { // Checkif the pattern does not works for invalid name with less than 3 characters
        try{
        Assert.assertEquals(false, form.isFirstNamevalid("Il"));
        }catch(Exception e){
          log.info("exception occured is "+e);
        }
    }
    @Test
    public void checkGivenFirstNameisInvalidForFirstLetterLowerCase() { // Checks if there is no upper case in first Character
       try {
        Assert.assertEquals(false, form.isFirstNamevalid("iliyas"));
       } catch (Exception e) {
        log.info("exception occured is "+e);

       }
    }
    @Test
    public void checkGivenFirstNameisInvalidForNumericVAlues() { //Checks if there is Numeric Digits in Name
        try {
        Assert.assertEquals(false, form.isFirstNamevalid("Iliyas123"));
            
        } catch (Exception e) {
        log.info("exception occured is "+e);
            
        }
    }
    @Test
    public void checkGivenLastNameIsValid() { // Same as first name
        try {
        Assert.assertEquals(true, form.isLastNameValid("Shahapure"));            
        } catch (Exception e) {
        log.info("exception occured is "+e);

        }
    }
    @Test
    public void checkGivenLastNameIsInvalidForlessThan3Characters() {
        try {
        Assert.assertEquals(false, form.isLastNameValid("Sh"));
        } catch (Exception e) {
        log.info("exception occured is "+e);
            
        }
    }
    @Test
    public void checkGivenLastNameisInvalidForFirstLetterLowerCase() {
        try {
        Assert.assertEquals(false, form.isLastNameValid("shahapure"));
            
        } catch (Exception e) {
        log.info("exception occured is "+e);

        }
    }
    @Test
    public void checkGivenLastNameisInvalidForNumericVAlues() {
        try {
        Assert.assertEquals(false, form.isLastNameValid("Shahapure123"));
            
        } catch (Exception e) {
        log.info("exception occured is "+e);
            
        }
    }
    @Test
    public void checkGivenEmailisValid() { // Checks for valid email
        try {
            Assert.assertEquals(true, form.isEmailValid("abc.xyz@gmail.com"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenEmailisInvalid() { // Checks for invalid email
        try {
            Assert.assertEquals(false, form.isEmailValid("abc..xyz@gmail.com"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenMobileNumberisValid() { // Checks For valid number
        try {
        Assert.assertEquals(true, form.isMobileNumberValid("91 9395390866"));
        } catch (Exception e) {
            log.info("Exception occured is " + e);

        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithoutSpace() { // Checks the space between country code and the number
        try {
        Assert.assertEquals(false, form.isMobileNumberValid("919395390866"));
        } catch (Exception e) {
            log.info("Exception occured is " + e);
        
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithLessThan10Digits() { // Checks for less than 10 digits in number after country code
        try {
        Assert.assertEquals(false, form.isMobileNumberValid("91 9395380"));
            
        } catch (Exception e) {
        log.info("exception occured is "+e);
            
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithNot91InFirsttwoPlaces() { // checks for country code other than 91
        try {
        Assert.assertEquals(false, form.isMobileNumberValid("52 9395390866"));
        } catch (Exception e) {
        log.info("exception occured is "+e);
            
        }
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithFirstCharacterAfterSpaceIsLessThan() { // checks for first number after country code is more than 6
        try {
        Assert.assertEquals(false, form.isMobileNumberValid("91 4210029078"));
            
        } catch (Exception e) {
        log.info("exception occured is "+e);

        }
    }
    @Test
    public void checkGivenPasswordIsValid() { // checks for valid password
        try {
            Assert.assertEquals(true, form.isPasswordValid("Asad@12Sad"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforLessThan8Characters() { //checks for password less than 8 characters
        try {
            Assert.assertEquals(false, form.isPasswordValid("Ad@12S"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoUpperCaseCharacter() { // checks for password  with no upper case
        try {
            Assert.assertEquals(false, form.isPasswordValid("asd@12dffgd"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoLowercaseCaracters() { // checks for password  with no lower case
        try {
            Assert.assertEquals(false, form.isPasswordValid("ASFG@2512S"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
    @Test
    public void checkGivenPasswordISInvalidforNoSpecialCharacters() { //checks for password with no special characters
        try {
            Assert.assertEquals(false, form.isPasswordValid("AdjgdsS512S"));
        }catch(Exception e) {
            log.info("Exception occured is " + e);
        }
    }
}
