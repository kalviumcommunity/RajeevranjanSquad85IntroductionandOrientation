package src.com.school;

public class Course {
    private int courseId;
    private String name;

    public void setCourse(int courseId , String name){
    this.courseId = courseId;
    this.name = name;
    }
    public void display() {
        System.out.println("courseId: " +" " + courseId +" " + "name: " + " " + name);
    }


}
