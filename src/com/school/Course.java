package src.com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String name;

    // Constructor to initialize course name and auto-generate courseId
    public Course(String name) {
        this.courseId = nextCourseIdCounter++;
        this.name = name;
    }

    public void setCourse(int courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    } 
    public int getCourseId() {
        return courseId;
    } 
    public String getCourseName() {
        return name;
    }

    public void display() {
        System.out.println("courseId: " + " " + courseId + " " + "name: " + " " + name);
    }

}
