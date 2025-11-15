package service;

import model.Student;

public interface RecordActions {

    void addStudent(Student s);

    void deleteStudent(int rollNo);

    void updateStudent(int rollNo, Student updatedStudent);

    Student searchStudent(int rollNo);

    void viewAllStudents();
}
