package by.it.stolybko.calculator;

public class Calculator {
    public double sum(int a, int b) {
        return a + b;
    }

    public double subtraction(int a, int b) {
        return a - b;
    }

    public double multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if(b==0){
            throw new ArithmeticException("Делить на 0 нельзя")
        }
        return a / b;
    }
}
