package model;

public class Student extends Person {

    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    public Student(String name, String email, int rollNo, String course, double marks, String grade) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    // METHOD OVERLOADING
    public void displayInfo(boolean showMarks) {
        displayInfo();
        if (showMarks) {
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }
        System.out.println("[Note] Overloaded display method:");
    }

    // Getters & Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setCourse(String c) {
        this.course = c;
    }

    public void setMarks(double m) {
        this.marks = m;
    }
}
