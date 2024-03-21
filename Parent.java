public class Parent {

    public int x; // public variable

    public void display() { // public method
        System.out.println("Value of x: " + x);
    }

    protected class Child extends Parent {

        public void setValue(int value) {
            x = value; // accessing public variable from superclass
        }

        public void displayValue() {
            display(); // accessing public method from superclass
        }

    }

}
