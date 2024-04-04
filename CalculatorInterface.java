// Define the Arithmetic interface
interface Arithmetic {
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
    void mod(int a, int b);
}

// Implement the Arithmetic interface
class Calculator implements Arithmetic {
    @Override
    public void add(int a, int b) { System.out.println("Addition: " + (a + b)); }
    @Override
    public void sub(int a, int b) { System.out.println("Subtraction: " + (a - b)); }
    @Override
    public void mul(int a, int b) { System.out.println("Multiplication: " + (a * b)); }
    @Override
    public void div(int a, int b) { System.out.println((b != 0) ? "Division: " + (a / b) : "Cannot divide by zero"); }
    @Override
    public void mod(int a, int b) { System.out.println((b != 0) ? "Modulus: " + (a % b) : "Cannot perform modulus with zero"); }
}

public class CalculatorInterface {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform operations using switch case
        int num1 = 10, num2 = 5, choice = 1; // Change choice value to perform different operations

        switch (choice) {
            case 1: calculator.add(num1, num2); break;
            case 2: calculator.sub(num1, num2); break;
            case 3: calculator.mul(num1, num2); break;
            case 4: calculator.div(num1, num2); break;
            case 5: calculator.mod(num1, num2); break;
            default: System.out.println("Invalid choice");
        }
    }
}
