package src.com.school;

public class AttendanceRecord implements Storable {
    private Student student;
    private Course course;
    private String status; // e.g., "Present", "Absent"

    public AttendanceRecord(Student student, Course course, String status) {
        this.student = student;
        this.course = course;
        // Basic validation for status
        if ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } else {
            this.status = "Invalid"; // Default for invalid input
            System.out.println("Warning: Invalid attendance status provided. Set to 'Invalid'.");
        }
    }

    // Getters
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getStatus() {
        return status;
    }

    public void displayRecord() {
        System.out.println("Attendance: Student ID " + student.getId() +
                " (" + student.getName() + ") in Course: " + course.getCourseName() +
                " (ID: " + course.getCourseId() + ") - Status: " + status);
    }

    @Override
    public String toDataString() {
        // Format: studentId,courseId,status
        return student.getId() + "," + course.getCourseId() + "," + status;
    }
}