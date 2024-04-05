import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicates {
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

        // Remove duplicates using Stream API
        List<String> uniqueList = inputList.stream()
                                           .distinct() // Remove duplicates
                                           .collect(Collectors.toList()); // Collect the unique strings into a list

        // Print the list without duplicates
        System.out.println("List without duplicates:");
        uniqueList.forEach(System.out::println); // Print each string in the unique list

        scanner.close(); // Close the scanner
    }
}
