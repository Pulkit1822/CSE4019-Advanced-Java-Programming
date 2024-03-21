class Parent {
    protected int x; // protected variable

    protected void display() { // protected method 
        System.out.println("Value of x: " + x);
    }
}

// Subclass inheriting from Parent 
class Child extends Parent {
    public void setValue(int value) {
        x = value; // accessing protected variable from superclass
    }

    public void displayValue() {
        display(); // accessing protected method from superclass
    }
}

public class Ma {
    public static void main(String[] args) {

        Child child = new Child();
        child.setValue(10); // accessing and setting value through subclass method 
        child.displayValue(); // accessing and displaying value through subclass method
    }
}

