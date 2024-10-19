package by.it.stolybko.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//Добавила тесты для деления
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

    @Test
    public void testDididePositive(){
        Assertions.assertEquals(3, calculator.divide(9,3));
    }
    @Test
    public void testDidideNegative(){
        Assertions.assertEquals(3, calculator.divide(-9,-3));
    }
    @Test
    public void testDididePositiveNegative(){
        Assertions.assertEquals(-3, calculator.divide(9,-3));
    }
    @Test
    public void testDidideZeroPositive(){
        Assertions.assertEquals(0, calculator.divide(0,3));
    }
    @Test
    public void testDidideZeroNegative(){
        Assertions.assertEquals(0, calculator.divide(0,-3));
    }
    @Test
    public void testDidideZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(9, 0);
        });
    }







}
