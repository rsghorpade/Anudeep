import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read strings from the user
        List<String> inputList = new ArrayList<>();
        System.out.println("Enter strings (enter 'done' to finish):");
        String input = scanner.nextLine();
        
        // Keep reading strings until the user enters "done"
        while (!input.equalsIgnoreCase("done")) {
            inputList.add(input); // Add the input string to the list
            input = scanner.nextLine(); // Read the next input string
        }

        // Concatenate strings using Stream API
        StringBuilder concatenatedString = new StringBuilder(); // StringBuilder to concatenate strings
        inputList.stream()
                 .forEach(concatenatedString::append); // Append each string to the StringBuilder

        // Print the concatenated string
        System.out.println("Concatenated string:");
        System.out.println(concatenatedString.toString()); // Print the concatenated string

        scanner.close(); // Close the scanner
    }
}
