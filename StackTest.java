import java.util.Scanner;

// Define the Stack interface
interface Stack {
    void push(int value);
    int pop();
    int peek();
}

// Implement the Stack interface using an array
class ArrayStack implements Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack overflow!");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow!");
            return -1; // Return a sentinel value to indicate underflow
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty!");
            return -1; // Return a sentinel value to indicate empty stack
        }
    }
}

// Main class to test stack operations
public class StackTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the stack with a maximum size of 10
        Stack stack = new ArrayStack(10);

        // Get 10 different values from the user and push them onto the stack
        System.out.println("Enter 10 values to push onto the stack:");
        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();
            stack.push(value);
        }

        // Perform stack operations: pop, peek
        System.out.println("Popped element: " + stack.pop()); // Pop an element
        System.out.println("Top element: " + stack.peek());   // Peek at the top element

        scanner.close();
    }
}
