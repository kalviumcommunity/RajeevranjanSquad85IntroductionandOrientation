package src.com.school;

public class Student {
    private int Id ;
    private String name;

    public void setDetails(int Id , String name) {
        this.Id = Id;
        this.name = name;
    } 
   public void displayDetails() {
    System.out.println("Studen Id: " +" "+ Id +" " + "Student name: "+" " + name);
   }
}
