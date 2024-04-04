// Define the Arithmetic interface
interface Arithmetic {
    public void add(int a, int b);
    public void sub(int a, int b);
    public void mul(int a, int b);
    public void div(int a, int b);
    public void mod(int a, int b);
}

// Implement the Arithmetic interface
class Calculator implements Arithmetic {
    @Override
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    @Override
    public void mod(int a, int b) {
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Cannot perform modulus with zero");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform operations using switch case
        int num1 = 10;
        int num2 = 5;
        int choice = 1; // Change this value to perform different operations

        switch (choice) {
            case 1:
                calculator.add(num1, num2);
                break;
            case 2:
                calculator.sub(num1, num2);
                break;
            case 3:
                calculator.mul(num1, num2);
                break;
            case 4:
                calculator.div(num1, num2);
                break;
            case 5:
                calculator.mod(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}