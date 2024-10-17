package by.it.stolybko.calculator;

public class MainCalculator extends Exception {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(6, 7));
        System.out.println(calculator.subtraction(7, 9));
        System.out.println(calculator.multiply(5, 6));

        try {
            System.out.println(calculator.divide(90, 0));
            System.out.println(calculator.divide(90, 30));
        } catch (ArithmeticException e) {
            System.out.println("Делить на 0 нельзя");
        }
    }
}