package Day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String start = "y";
        double number1;
        double number2;
        char operation;

        while (start.equalsIgnoreCase("y")) {
            System.out.print("Enter first number: ");
            number1 = input.nextDouble();

            System.out.print("Enter Second number: ");
            number2 = input.nextDouble();

            System.out.print("Enter operation you need to perform");
            operation = input.next().charAt(0);

            switch (operation) {
                case '+' -> addition(number1, number2);
                case '-' -> subtraction(number1, number2);
                case '*' -> multiplication(number1, number2);
                case '/' -> division(number1, number2);
                default -> System.out.println("Invalid Operator! Try Again");
            }

            System.out.print("Do you wish to continue? (y/n): ");
            start = input.next();
        }
        System.out.print("Thank you for using calculator.");
    }
}