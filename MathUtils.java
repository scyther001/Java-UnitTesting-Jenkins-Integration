public class MathUtils {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract second integer from the first
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide the first integer by the second
    // Returns -1.0 if division by zero occurs
    public double divide(int a, int b) {
        if (b == 0) {
            return -1.0; // Return -1 if division by zero
        }
        return (double) a / b;
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        MathUtils math = new MathUtils();

        System.out.println("Addition: " + math.add(5, 3));  // Should print 8
        System.out.println("Subtraction: " + math.subtract(5, 3));  // Should print 2
        System.out.println("Multiplication: " + math.multiply(5, 3));  // Should print 15
        System.out.println("Division: " + math.divide(5, 3));  // Should print 1.666...
        System.out.println("Division by Zero: " + math.divide(5, 0));  // Should print -1.0
    }
}
