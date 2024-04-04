import java.util.Scanner;

class Student {
    String name, gender;
    int rollNo, age, sub1, sub2;
    
    // Method to initialize student details
    void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        System.out.print("Enter gender: ");
        gender = scanner.next();
        System.out.print("Enter marks for subject 1: ");
        sub1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        sub2 = scanner.nextInt();
    }
    
    // Method to display student details
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marks for Subject 1: " + sub1);
        System.out.println("Marks for Subject 2: " + sub2);
    }
    
    // Method to calculate total marks
    int calculateTotal() {
        return sub1 + sub2;
    }
    
    // Method to calculate percentage
    float calculatePercentage() {
        return (float) (calculateTotal() * 100) / 200;
    }
    
    // Method to calculate grade
    String calculateGrade() {
        float percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C+";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        // Create an array of Student objects
        Student[] students = new Student[n];
        
        // Initialize and display details for each student
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i+1) + ":");
            students[i].initialize();
            students[i].display();
            System.out.println("Total Marks: " + students[i].calculateTotal());
            System.out.println("Percentage: " + students[i].calculatePercentage() + "%");
            System.out.println("Grade: " + students[i].calculateGrade());
        }
    }
}
