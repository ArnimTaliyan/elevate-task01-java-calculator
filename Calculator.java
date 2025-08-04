import java.util.Scanner;

public class Calculator {
    //Public method to perform addition
    public static void addition(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("Addition of " + number1 + " and " + number2 + " is: "+ result);
    }

    //Public method to perform subtraction
    public static void subtraction(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is: "+ result);
    }

    //Public method to perform multiplication
    public static void multiplication (double number1, double number2) {
        double result = number1 * number2;
        System.out.println("Multiplication  of " + number1 + " and " + number2 + " is: "+ result);
    }

    //Public method to perform division
    public static void division(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Cannot divide by zero! Try again.");
        } else {
            double result = number1 / number2;
            System.out.println("Division  of " + number1 + " and " + number2 + " is: "+ result);
        }
    }

    public static void main(String[] args) {
        //Initialising scanner to take user input
        Scanner input = new Scanner(System.in);

        //Declaring variable for calculator
        String start = "y";
        double number1;
        double number2;
        char operation;

        while (start.equalsIgnoreCase("y")) {
            //User input for first number
            System.out.print("Enter first number: ");
            number1 = input.nextDouble();

            //User input for second number
            System.out.print("Enter Second number: ");
            number2 = input.nextDouble();

            //User input for operation to perform
            System.out.print("Enter operation you need to perform (+, -, *, /): ");
            operation = input.next().charAt(0);

            //Switch statement to perform operation based on user input
            switch (operation) {
                case '+' -> addition(number1, number2);
                case '-' -> subtraction(number1, number2);
                case '*' -> multiplication(number1, number2);
                case '/' -> division(number1, number2);
                default -> System.out.println("Invalid Operator! Try Again");
            }

            //It helps to re-run or quit the program
            System.out.print("Do you wish to continue? (y/n): ");
            start = input.next();
        }
        System.out.print("Thank you for using calculator.");

        input.close();
    }
}