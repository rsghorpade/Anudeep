import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers and an operator
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }

            // Display the result
            System.out.println("Result: " + result);
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
