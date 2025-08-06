public class HelloWorld {
    public static void main(String[] args) {
        // This line prints "Hello, World!" to the console
        System.out.println("Hello, World!");
    }
#This is the starting of feature202 branch.
public class MathOperations {

    /**
     * This method adds two integers and returns their sum.
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @return The sum of num1 and num2.
     */
    public int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        // Create an object of the MathOperations class
        MathOperations calculator = new MathOperations();

        // Call the addNumbers method and store the result
        int result = calculator.addNumbers(10, 5);

        // Print the result
        System.out.println("The sum is: " + result); // Output: The sum is: 15
    }
}
}