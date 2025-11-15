import model.Student;
import service.StudentManager;

public class StudentManagementSystem {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student("Ankit", "ankit@mail.com", 101, "B.Tech", 89.5, "A");
        Student s2 = new Student("Riya", "riya@mail.com", 102, "M.Tech", 93.0, "A+");

        // Adding students
        manager.addStudent(s1);
        manager.addStudent(s2);

        // Viewing all
        manager.viewAllStudents();

        // Overloaded display
        s1.displayInfo(true);

        // Searching
        Student found = manager.searchStudent(101);
        if (found != null) {
            System.out.println("\n--- Search Result ---");
            found.displayInfo();
        }
    }
}
