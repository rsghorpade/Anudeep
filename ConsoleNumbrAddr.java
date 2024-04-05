import java.io.Console;

public class ConsoleNumbrAddr {
    public static void main(String[] args) {
        // Getting the console object
        Console console = System.console();
        
        // Checking if console is available
        if (console == null) {
            System.err.println("No console found. Please run this program in a command prompt.");
            System.exit(1);
        }

        // Getting input from the user
        String num1Str = console.readLine("Enter the first number: ");
        String num2Str = console.readLine("Enter the second number: ");

        try {
            // Parsing input strings to doubles
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            // Calculating the sum
            double sum = num1 + num2;
            
            // Printing the result
            System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        } catch (NumberFormatException e) {
            // Handling invalid input
            System.err.println("Invalid input. Please enter valid numbers.");
        }
    }
}
