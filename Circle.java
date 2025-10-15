public class Circle {

    private double radius;
public Circle(double newRadius) {
    radius = newRadius;
}
public void printArea() {
    double area = Math.PI * radius * radius;
    System.out.println("The area of a circle with radius " + radius + " is " + area);
}
}