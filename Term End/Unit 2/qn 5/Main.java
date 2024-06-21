public class Main {
    public static void main(String[] args) {
        // Creating an instance of StudentMarksCard
        StudentMarksCard student = new StudentMarksCard();
        
        // Setting properties
        student.setStudentName("John Doe");
        student.setRollNumber(101);
        student.setMarks(85);
        
        // Displaying the student marks card
        System.out.println(student);
    }
}
