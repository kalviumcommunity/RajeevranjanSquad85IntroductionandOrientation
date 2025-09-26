package src.com.school;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- School Administration & Attendance System ---");

        // --- Data Setup ---
        Student student1 = new Student("Alice Wonderland", "Grade 10");
        Student student2 = new Student("Bob The Builder", "Grade 9");
        Teacher teacher1 = new Teacher("Dr. Smith", "Physics");
        Staff staff1 = new Staff("Ms. Johnson", "Admin");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(student1);
        schoolPeople.add(student2);
        schoolPeople.add(teacher1);
        schoolPeople.add(staff1);

        displaySchoolDirectory(schoolPeople);

        List<Course> courses = new ArrayList<>();
        Course course1 = new Course("Intro to Quantum Physics");
        Course course2 = new Course("Advanced Algorithms");
        courses.add(course1);
        courses.add(course2);

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(student1, course1, "Present"));
        attendanceLog.add(new AttendanceRecord(student2, course1, "Absent"));
        attendanceLog.add(new AttendanceRecord(student1, course2, "Present"));

        System.out.println("\nCourses:");
        for (Course c : courses)
            c.displayDetails();
        System.out.println("\nAttendance Log (Initial):");
        for (AttendanceRecord ar : attendanceLog)
            ar.displayRecord();

        // --- Saving Data ---
        System.out.println("\n--- Saving Data to Files ---");
        FileStorageService storageService = new FileStorageService();

        // Filter students from schoolPeople for saving
        List<Student> students = new ArrayList<>();
        for (Person p : schoolPeople) {
            if (p instanceof Student) {
                students.add((Student) p);
            }
        }

        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        storageService.saveData(attendanceLog, "attendance_log.txt");

        System.out.println("\nSession 6: Interface-Driven Persistence (Saving) Complete.");
        System.out.println("Check students.txt, courses.txt, and attendance_log.txt for output.");
    }
}