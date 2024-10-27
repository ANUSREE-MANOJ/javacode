/**
 * The Calculator class provides methods to perform basic arithmetic operations:
 * addition,  and division.
 */
public class Calculator {

    /**
     * Main method where the program execution begins.
     * This method creates an instance of the Calculator class and performs
     * various arithmetic operations.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculator calc = new Calculator();

        // Perform addition, subtraction, multiplication, and division
        int addResult = calc.add(5, 3); // 5 + 3 = 8
        int subResult = calc.subtract(5, 3); // 5 - 3 = 2
        int mulResult = calc.multiply(5, 3); // 5 * 3 = 15
        double divResult = calc.divide(5, 3); // 5 / 3 = 1.6667

        // Print the results of each operation
        System.out.println("Addition: " + addResult);
        System.out.println("Subtraction: " + subResult);
        System.out.println("Multiplication: " + mulResult);
        System.out.println("Division: " + divResult);
    }

    /**
     * Adds two integers and returns the result.
     * 
     * @param a The first integer to add.
     * @param b The second integer to add.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first and returns the result.
     * 
     * @param a The integer to subtract from.
     * @param b The integer to be subtracted.
     * @return The difference between a and b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers and returns the result.
     * 
     * @param a The first integer to multiply.
     * @param b The second integer to multiply.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second and returns the result.
     * If the divisor is zero, prints an error message and returns 0.
     * 
     * @param a The dividend.
     * @param b The divisor.
     * @return The quotient of a divided by b, or 0 if b is zero.
     */
    public double divide(int a, int b) {
        // Check if the divisor is zero to prevent division by zero
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0; // Return 0 if division by zero occurs
        }
        return (double) a / b;
    }
}
