package com.javapractice;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationParametrizedTest {
  public String email;
  public boolean expectedResult;
  public UserRegistration form;
  private static final Logger log = LogManager.getLogger(UserRegistration.class);

  public UserRegistrationParametrizedTest(String email, boolean expectedResult) {
      super();
      this.email = email;
      this.expectedResult = expectedResult;
  }
  @Before
  public void initialize() {
      form = new UserRegistration();
  }
  @Parameterized.Parameters
  public static Collection input() {
      return Arrays.asList(new Object[][] {
          { "abc@yahoo.com", true },
          { "abc-100@yahoo.com" , true },
          { "abc.100@yahoo.com" , true },
          { "abc111@abc.net" , true },
          { "abc-100@abc.net" , true },
          { "abc.100@abc.com.au" , true },
          { "abc@1.com" , true },
          { "abc@gmail.com.com" , true },
          { "abc+100@gmail.com" , true },
          { "abc" , false },
          { "abc@.com.my" , false },
          { "abc123@gmail.a" , false },
          { "abc123@.com" , false },
          { "abc123@.com.com" , false },
          { ".abc@abc.com" , false },
          { "abc()*@gmail.com" , false },
          { "abc@%*.com" , false },
          { "abc..2002@gmail.com" , false },
          { "abc.@gmail.com" , false },
          { "abc@abc@@gmail.com" , false },
          { "abc@gmail.com.1a" , false },
          { "abc@gmail.com.aa.au" , false }
      });
  }
  @Test
  public void checkEmailIsvalidOrNot() {
      log.info("Email:" + this.expectedResult);
      Assert.assertEquals(this.expectedResult, form.isEmailValid(this.email));
  }
}
