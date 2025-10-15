package U1T6_Return;

public class Main {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 7);
        debbie.greeting("Ryan");
        debbie.weather();
        double meters = debbie.convertFeetToMeters(10);
        System.out.println("10 feet is " + meters + " meters.");
        debbie.favoriteNumber(12);
        int sum = debbie.addNumbers(5, 10, 15);
        System.out.println("The sum of the three numbers is " + sum);
        String byeMessage = debbie.goodbye();
        System.out.println(byeMessage);

        debbie.tellJoke();
        String complimentMsg = debbie.compliment("Ryan");
        System.out.println(complimentMsg);
        double product = debbie.multiply(4.2, 3.5);
        System.out.println("The product is " + product);
        debbie.funFact();
        String foodMsg = debbie.favoriteFood("pizza");
        System.out.println(foodMsg);
        int squared = debbie.squareNumber(6);
        System.out.println("The square is " + squared);
    }
}
