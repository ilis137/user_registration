package com.javapractice;


import org.junit.Test;
import org.junit.Assert;

import javax.xml.xpath.XPathEvaluationResult;

public class UserRegistrationTest {
    static UserRegistration person = new UserRegistration();
    @Test
    public void checkGivenFirstNameIsValidSouldRetuenTrue() { // Check if the pattern works for valid name
        Assert.assertEquals(true, person.isFirstNamevalid("Iliyas"));
    }
    @Test
    public void checkGivenFirstNameIsInvalidForlessThan3Characters() { // Checkif the pattern does not works for invalid name with less than 3 characters
        Assert.assertEquals(false, person.isFirstNamevalid("Il"));
    }
    @Test
    public void checkGivenFirstNameisInvalidForFirstLetterLowerCase() { // Checks if there is no upper case in first Character
        Assert.assertEquals(false, person.isFirstNamevalid("iliyas"));
    }
    @Test
    public void checkGivenFirstNameisInvalidForNumericVAlues() { //Checks if there is Numeric Digits in Name
        Assert.assertEquals(false, person.isFirstNamevalid("Iliyas123"));
    }
    @Test
    public void checkGivenLastNameIsValid() { // Same as first name
        Assert.assertEquals(true, person.isLastNameValid("Shahapure"));
    }
    @Test
    public void checkGivenLastNameIsInvalidForlessThan3Characters() {
        Assert.assertEquals(false, person.isLastNameValid("Sh"));
    }
    @Test
    public void checkGivenLastNameisInvalidForFirstLetterLowerCase() {
        Assert.assertEquals(false, person.isLastNameValid("shahapure"));
    }
    @Test
    public void checkGivenLastNameisInvalidForNumericVAlues() {
        Assert.assertEquals(false, person.isLastNameValid("Shahapure123"));
    }
    @Test
    public void checkGivenEmailisValid() { // Checks for valid email
        Assert.assertEquals(true,person.isEmailValid("abc.xyz@gmail.com"));
    }
    @Test
    public void checkGivenEmailisInvalid() { // Checks for invalid email
        Assert.assertEquals(false, person.isEmailValid("abc..xyz@gmail.com"));
    }
    @Test
    public void checkGivenMobileNumberisValid() { // Checks For valid number
        Assert.assertEquals(true, person.isMobileNumberValid("91 9395390866"));
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithoutSpace() { // Checks the space between country code and the number
        Assert.assertEquals(false, person.isMobileNumberValid("919395390866"));
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithLessThan10Digits() { // Checks for less than 10 digits in number after country code
        Assert.assertEquals(false, person.isMobileNumberValid("91 9395380"));
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithNot91InFirsttwoPlaces() { // checks for country code other than 91
        Assert.assertEquals(false, person.isMobileNumberValid("52 9395390866"));
    }
    @Test
    public void checkGivenMobileNumberisInvalidWithFirstCharacterAfterSpaceIsLessThan() { // checks for first number after country code is more than 6
        Assert.assertEquals(false, person.isMobileNumberValid("91 4210029078"));
    }
    @Test
    public void checkGivenPasswordIsValid() { // checks for valid password
        Assert.assertEquals(true, person.isPasswordValid("Asad@12Sad"));
    }
    @Test
    public void checkGivenPasswordISInvalidforLessThan8Characters() { //checks for password less than 8 characters
        Assert.assertEquals(false, person.isPasswordValid("Ad@12S"));
    }
    @Test
    public void checkGivenPasswordISInvalidforNoUpperCaseCharacter() { // checks for password  with no upper case
        Assert.assertEquals(false, person.isPasswordValid("asd@12dffgd"));
    }
    @Test
    public void checkGivenPasswordISInvalidforNoLowercaseCaracters() { // checks for password  with no lower case
        Assert.assertEquals(false, person.isPasswordValid("ASFG@2512S"));
    }
    @Test
    public void checkGivenPasswordISInvalidforNoSpecialCharacters() { //checks for password with no special characters
        Assert.assertEquals(false, person.isPasswordValid("AdjgdsS512S"));
    }
}