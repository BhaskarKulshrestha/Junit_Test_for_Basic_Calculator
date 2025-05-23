package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    // ADDITION
    @Test void testAddPositive() { assertEquals(8, calc.add(5, 3)); }
    @Test void testAddNegative() { assertEquals(-9, calc.add(-2, -7)); }
    @Test void testAddMixedSign() { assertEquals(4, calc.add(-3, 7)); }
    @Test void testAddWithZero() { assertEquals(5, calc.add(0, 5)); }
    @Test void testAddOverflow() { assertEquals(Integer.MIN_VALUE, calc.add(Integer.MAX_VALUE, 1)); }

    // SUBTRACTION
    @Test void testSubtractPositive() { assertEquals(5, calc.subtract(9, 4)); }
    @Test void testSubtractNegative() { assertEquals(-3, calc.subtract(-5, -2)); }
    @Test void testSubtractMixedSign() { assertEquals(9, calc.subtract(3, -6)); }
    @Test void testSubtractWithZero() { assertEquals(10, calc.subtract(10, 0)); }
    @Test void testSubtractUnderflow() { assertEquals(Integer.MAX_VALUE, calc.subtract(Integer.MIN_VALUE, 1)); }

    // MULTIPLICATION
    @Test void testMultiplyPositive() { assertEquals(24, calc.multiply(4, 6)); }
    @Test void testMultiplyNegative() { assertEquals(-6, calc.multiply(-3, 2)); }
    @Test void testMultiplyMixedSign() { assertEquals(21, calc.multiply(-7, -3)); }
    @Test void testMultiplyWithZero() { assertEquals(0, calc.multiply(0, 500)); }
    @Test void testMultiplyWithLargeNumber() { assertEquals(Integer.MAX_VALUE, calc.multiply(Integer.MAX_VALUE, 1)); }

    // DIVISION
    @Test void testDividePositive() { assertEquals(5, calc.divide(10, 2)); }
    @Test void testDivideNegative() { assertEquals(-2, calc.divide(-8, 4)); }
    @Test void testDivideMixedSign() { assertEquals(5, calc.divide(-15, -3)); }
    @Test void testDivideZeroNumerator() { assertEquals(0, calc.divide(0, 8)); }
    @Test void testDivideByZero() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
        assertEquals("Cannot divide by zero!", e.getMessage());
    }
}
