import java.util.function.Function;

public class StringManipulation {
    public static void main(String[] args) {
        // Input string
        String inputString = "Hello, Gaurav";
        
        // Lambda expressions to perform string operations
        Function<String, String> toUpperCase = str -> str.toUpperCase(); // Lambda to convert string to uppercase
        Function<String, String> toLowerCase = str -> str.toLowerCase(); // Lambda to convert string to lowercase
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString(); // Lambda to reverse the string
        
        // Applying the lambda expressions
        String upperCaseString = operateOnString(inputString, toUpperCase); // Applying uppercase lambda
        String lowerCaseString = operateOnString(inputString, toLowerCase); // Applying lowercase lambda
        String reversedString = operateOnString(inputString, reverseString); // Applying reverse lambda
        
        // Output
        System.out.println("Original String: " + inputString);
        System.out.println("Uppercase String: " + upperCaseString);
        System.out.println("Lowercase String: " + lowerCaseString);
        System.out.println("Reversed String: " + reversedString);
    }
    
    // Method to apply the lambda expression on the input string
    public static String operateOnString(String input, Function<String, String> operation) {
        return operation.apply(input);
    }
}
