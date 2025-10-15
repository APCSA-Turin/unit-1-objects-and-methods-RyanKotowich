
public class Student {
    
private String name;
private double gpa;

public Student(String studentName , double studentGpa) {
    name = studentName;
      gpa = studentGpa; }


public void introduce() {
    System.out.println("Hello my name is " + name + " and my GPA is " + gpa);
}
}
