package src.com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails (1 , "Rajeev");
        students[1] = new Student();
        students[1].setDetails(2, "Vikram");

        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setCourse(0, "OOPS");
        courses[1] = new Course();
        courses[1].setCourse(1, "JAVA");

        for (Student sTudent : students) {
            sTudent.displayDetails();
        }
        for (Course cOurse : courses) {
            cOurse.display();
        }
    }
}
