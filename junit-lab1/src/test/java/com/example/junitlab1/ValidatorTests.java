package com.example.junitlab1;
import jdk.jfr.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class ValidatorTests {
    Validator validator = new Validator();

    @Test
    @DisplayName("Should return true when phone number starts with zero")
    public void returnTrueIfNumberStartsWithZero(){
        Boolean result = validator.isPhoneNumberValid("0709767654");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return false when phone number does not start with zero")
    public void returnFalseIfNumberNotStartsWithZero(){
        Boolean result = validator.isPhoneNumberValid("9709767654");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when phone number has less then six numbers")
    public void returnFalseIfNumbersAreLessThanSix(){
        Boolean result = validator.isPhoneNumberValid("4");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when phone number starts with zero but has less than 6 numbers")
    public void returnFalseNumberLessThanSixStartingWithZero(){
        Boolean result = validator.isPhoneNumberValid("098");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return true when phone number has more then six numbers and starts with zero")
    public void returnTrueMoreThanSiXNumbersStartsWithZero(){
        Boolean result = validator.isPhoneNumberValid("0709772");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return false when phone number has more than ten numbers")
    public void returnFalseNumberMoreThanTen(){
        Boolean result = validator.isPhoneNumberValid("07879876545");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when phone number has invalid tokens")
    public void returnFalseNotValidTokens(){
        Boolean result = validator.isPhoneNumberValid("070kd9765");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false when phone number is blank")
    public void returnFalseWhenBlank(){
        Boolean result = validator.isPhoneNumberValid("");
        Assertions.assertFalse(result);
    }

    // Test validator email

    @Test
    @DisplayName("Should return true when all required String Parts are present")
    public void fullEmailValidator(){
        boolean result = validator.isEmailValid("ead@gmail.se");
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return false if no top domain is present")
    public void returnFalseIfNoTopDomainIsPresent(){
        boolean result = validator.isEmailValid("ead@gmail");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false if no at sign is present")
    public void returnFalseIfNoIndexOfAtSignIsPresent(){
        boolean result = validator.isEmailValid("eadgmail.se");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false if no name is present")
    public void returnFalseIfNoNameIsPresent(){
        boolean result = validator.isEmailValid("@gmail.se");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false if dot sign is misplaced")
    public void returnFalseIfDotIsMisplaced(){
        boolean result = validator.isEmailValid("ead@.gmailse");
        Assertions.assertFalse(result);
    }

    @Test
    @DisplayName("Should return false if at sign is misplaced")
    public void returnFalseIfAtSignIsMisplaced(){
        boolean result = validator.isEmailValid("eadgmail@.com");
        Assertions.assertFalse(result);
    }



}

