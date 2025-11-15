package service;

import model.Student;
import java.util.HashMap;
import java.util.Map;

public class StudentManager implements RecordActions {

    private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        if (studentMap.containsKey(s.getRollNo())) {
            System.out.println("Duplicate Roll Number! Student Not Added.");
        } else {
            studentMap.put(s.getRollNo(), s);
            System.out.println("Student Added Successfully.");
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (studentMap.remove(rollNo) != null) {
            System.out.println("Student Deleted Successfully.");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public void updateStudent(int rollNo, Student updatedStudent) {
        if (studentMap.containsKey(rollNo)) {
            studentMap.put(rollNo, updatedStudent);
            System.out.println("Student Updated Successfully.");
        } else {
            System.out.println("Student Not Found.");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        for (Student s : studentMap.values()) {
            s.displayInfo();
            System.out.println("----------------------");
        }
    }
}
