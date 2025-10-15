package U1T6_Return;
import java.util.Scanner;

public class RectangleRunner {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter rectangle 1 length: ");
        int length = scanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int width = scanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double height = scanner.nextDouble();
        System.out.println("Enter rectangle 2 length: ");
        int length2 = scanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int width2 = scanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double height2 = scanner.nextDouble();
scanner.close();
        Rectangle rect1 = new Rectangle(length, width);
        Rectangle rect2 = new Rectangle(length2, width2);

        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();
        double volume1 = rect1.calculateBoxVolume(height);
        double volume2 = rect2.calculateBoxVolume(height2);
        System.out.println("Rectangle 1 area: " + area1 + ", volume: " + volume1);
        System.out.println("Rectangle 2 area: " + area2 + ", volume: " + volume2);
 
    }
}