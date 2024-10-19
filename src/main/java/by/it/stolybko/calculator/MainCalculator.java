package by.it.stolybko.calculator;
// Убрала extends Exception. Почитала, что наследование
// от Exception используется, если необходимо е создать свое собственное исключение в Java.
public class MainCalculator {
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