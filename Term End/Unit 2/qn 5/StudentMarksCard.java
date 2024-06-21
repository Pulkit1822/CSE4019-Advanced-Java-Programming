import java.io.Serializable;

public class StudentMarksCard implements Serializable {
    private String studentName;
    private int rollNumber;
    private int marks;

    // No-argument constructor
    public StudentMarksCard() {}

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Business logic method (optional)
    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName + ", Roll Number: " + rollNumber + ", Marks: " + marks + ", Grade: " + getGrade();
    }
}

