import java.util.Scanner;


public class CoinCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, how much money do you want to insert?(Dollars and Cents) ");
        double money = scanner.nextDouble();
       
        int quarters = (int) (money / 0.25);
        double result = money % 0.25;
       
        int dimes = (int) (result / 0.1);
        result = result % 0.1;
       
        int nickels = (int) (result / 0.05);
        result = result % 0.05;
       
        int pennies = (int) (result / 0.01);
       
        System.out.println("Ok that will be ");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
       
        int total_coins = quarters + dimes + nickels + pennies;
        System.out.println("For a total of " + total_coins + " coins");
       
        scanner.close();
    }
}
