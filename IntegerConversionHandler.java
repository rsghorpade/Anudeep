import java.util.Scanner;

public class IntegerConversionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String userInput = scanner.nextLine();

            // Handle NullPointerException
            if (userInput == null) {
                throw new NullPointerException("Input is null.");
            }

            int number = Integer.parseInt(userInput);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } catch (NullPointerException e) {
            System.out.println("Error: Input is null.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
