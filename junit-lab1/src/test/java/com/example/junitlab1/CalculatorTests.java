package com.example.junitlab1;
import jdk.jfr.Name;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {
    Calculator calculator= new Calculator();

    @Test
    @DisplayName("Should give expected result when adding two numbers")
    public void addTwoNumbers() {
        int result = calculator.add(2, 3);
        Assertions.assertEquals(5, result);
        }

    @Test
    @DisplayName("Should return true when checking if number is valid")
    public void checkValidNumber() {
        int result = calculator.add(2, 3);
        Assertions.assertTrue(result>3);
    }

    @Test
    @DisplayName("Should return expected result when subtracting two numbers")
    public void subtractTwoNumbers() {
        int result = calculator.subtract(5, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Should return expected result when multiplying two numbers")
    public void multiplyTwoNumbers() {
        int result = calculator.multiply(7, 7);
        Assertions.assertEquals(49, result);
    }

    @Test
    @DisplayName("Should return expected result when dividing two numbers")
    public void divideTwoNumbers() {
        double result = calculator.divide(6, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    @DisplayName("Should return expected result when calculating square root of a number")
    public void squareRootOfNumber() {
        double result = calculator.squareRootOf(16);
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("Should return true when writing a positive number")
    public void getAreaPositiveNumber() {
        double result = calculator.getArea(16);
        Assertions.assertTrue(result >0);
    }

    @Test
    @DisplayName("Should return false when writing a negative number")
    public void getAreaNegativeNumber() {
        double result = calculator.getArea(-16);
        Assertions.assertFalse(result >0);
    }

    @Test
    @DisplayName("Should return true when writing a positive number")
    public void getCircumferencePositiveNumber() {
        double result = calculator.getCircumference(24);
        Assertions.assertTrue(result >0);
    }

    @Test
    @DisplayName("Should return false when writing a negative number")
    public void getCircumferenceNegativeNumber() {
        double result = calculator.getCircumference(-20);
        Assertions.assertFalse(result >0);
    }

}