
# labAssigment-021--2
![GreenRocketGIF](https://github.com/user-attachments/assets/816cd428-8a36-48d9-84e0-0629aee970d7)
## STUDENT MANAGEMENT SYSTEM
This project is a console-based Student Management System implemented in Java. It demonstrates key Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, abstract classes, interfaces, method overloading/overriding, and modular design.

#
The system allows users to add, search, update, delete, and view student records with automatic grade calculation based on marks.
# OBJECTIVES
Apply Inheritance using an abstract parent class (Person) and a child class (Student).

Implement Interfaces for CRUD operations (RecordActions).

Demonstrate Polymorphism:

Static Polymorphism → Method Overloading (calculateGrade() in Student).
Dynamic Polymorphism → Method Overriding (displayInfo() in Student, CRUD in StudentManager).
Use Collections (HashMap) to efficiently store and manage students.

Provide a menu-driven system to handle student operations dynamically.

# Class Hierarchy
Person (abstract class)

Fields: name, email
Abstract Method: displayInfo()
Student (extends Person)

Fields: rollNo, course, marks, grade

Methods:
calculateGrade(double marks)
calculateGrade(int marks) (overloaded)
Overrides displayInfo()
RecordActions (interface)

Methods:
addStudent(Student s)
deleteStudent(int rollNo)
updateStudent(int rollNo, Student s)
searchStudent(int rollNo)
viewAllStudents()
StudentManager (implements RecordActions)

Uses HashMap<Integer, Student> for storage
Implements all CRUD methods with duplicate roll number prevention
StudentManagementSystem (Main Class)

Provides menu-driven interface
Uses Scanner for dynamic input
Demonstrates add, update, delete, search, and view operations
# Data Types Used
String → name, email, course
int → rollNo
double → marks
HashMap<Integer, Student> → storage and management of student records
## Features

1. **Add Student**: Add a student with unique roll number.
2. **Delete Student**: Delete a student using roll number.
3. **Update Student**: Update student details.
4. **Search Student**: Search for a student by roll number.
5. **View All Students**: Display all student records.
6. **Method Overloading**: Demonstrates multiple `displayInfo()` methods in `Student`.
7. **Method Overriding**: `Student` overrides `displayInfo()` from `Person`.


## scrreenshot ##
<img width="1462" height="516" alt="Screenshot 2025-11-15 161121" src="https://github.com/user-attachments/assets/547922f1-6d83-4977-a0d6-8589be493ec2" />
<img width="1462" height="516" alt="Screenshot 2025-11-15 161121" src="https://github.com/user-attachments/assets/b01c59be-1d9f-4f9c-a3fd-09b608c8ec92" />
# How to run
Step 1: Open terminal in project root

```powershell
cd C:\Users\ASUS\OneDrive\Documents\labAssigment-2
javac -d out (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
java -cp out StudentManagementSystem

