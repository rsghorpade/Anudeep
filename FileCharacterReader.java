import java.io.FileReader; // file readeer package
import java.io.IOException; // exception package

public class FileCharacterReader {
    public static void main(String[] args) {
        String filename = "G:\\Reseumes\\Anudeep\\Demo\\Sample.txt";

        try (FileReader fileReader = new FileReader(filename)) {
            int character;
            int totalCharacters = 0;

            System.out.println("Contents of the file:");

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
                totalCharacters++;
            }

            System.out.println("\nTotal number of characters in the file: " + totalCharacters);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
