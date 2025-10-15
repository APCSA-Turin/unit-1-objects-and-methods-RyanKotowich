import java.util.Scanner;


public class Challenges {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Enter the first number:");
double num1 = scan.nextDouble();
System.out.print("Enter the second number:");
double num2 = scan.nextDouble();
System.out.print("Enter the third number:");
double num3 = scan.nextDouble();
System.out.print("Enter the fourth number:");
double num4 = scan.nextDouble();
System.out.println("The average is " + (num1 + num2 + num3 + num4) / 4);
 int roundedAverage = (int) (((num1 + num2 + num3 + num4) / 4) + 0.5);
 System.out.println("The rounded average is " + roundedAverage);
if (roundedAverage > 65) {
    System.out.println("You passed!");
} else {
    System.out.println("You failed.");
}




scan.close();    }
}
