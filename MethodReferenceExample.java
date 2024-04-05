// Functional interface for an operation that takes an integer and returns an integer
@FunctionalInterface
interface IntOperation {
    int perform(int num);
}

public class MethodReferenceExample {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int number = 5;

        // Using method reference to call the static method square
        IntOperation operation = MethodReferenceExample::square;

        // Calling the method through the functional interface
        int result = operation.perform(number);

        // Output
        System.out.println("Number: " + number);
        System.out.println("Square: " + result);
    }
}
