package by.it.stolybko.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void testSumPositive() {
        Assertions.assertEquals(5, calculator.sum(2,3));
    }
    @Test
    public void testSumNegative() {
        Assertions.assertEquals(-38, calculator.sum(-7,-31));
    }
    @Test
    public void testSumZeroPozitive() {
        Assertions.assertEquals(5, calculator.sum(0,5));
    }
    @Test
    public void testSumZeroNegative() {
        Assertions.assertEquals(-5, calculator.sum(0,-5));
    }
    @Test
    public void testSumZeroNegativePositive() {
        Assertions.assertEquals(-3, calculator.sum(2,-5));
    }
    @Test
    public void testSumZeroZero() {
        Assertions.assertEquals(0, calculator.sum(0,0));
    }
}
