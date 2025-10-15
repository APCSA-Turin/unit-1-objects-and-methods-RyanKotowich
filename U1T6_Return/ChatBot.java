package U1T6_Return;
public class ChatBot {

   private String name;
   private int number;

   public ChatBot(String chatBotName, int faveNum) {
       name = chatBotName;
       number = faveNum;
   }

   public void greeting(String yourName) {
       System.out.println("Hello, " + yourName + " my name is " + name);
       System.out.println("and I am a chat bot! How are you today?");
   }

   public void weather() {
       System.out.println("I actually don't know much about the weather! Ha ha!");
       System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
   }

   public double convertFeetToMeters(int numFeet) {
       final double METERS_PER_FOOT = 0.3048;
       return METERS_PER_FOOT * numFeet;
   }

   public void favoriteNumber(int yourNumber) {
       int distance = yourNumber - number;
       System.out.println("My favorite number is " + number);
       System.out.println("That is " + distance + " away from your number!");
   }

   public int addNumbers(int num1, int num2, int num3) {
       return num1 + num2 + num3;
   }

   public String goodbye() {
       return "It was nice talking with you! Have a great day! Sincerely, " + name; }
   

   public void tellJoke() {
       System.out.println("Why did the computer go to therapy? It had a hard drive!");
   }

   public String compliment(String personName) {
       return "Hope you're having a nice day, " + personName + "!";
   }

   public double multiply(double a, double b) {
       return a * b; }
   

   public void funFact() {
       System.out.println("Fun fact: The first computer bug was an actual moth!");
   }

   public String favoriteFood(String food) {
       return (food + " sounds delicious!");
   }

   public int squareNumber(int num) {
       return num * num;
   }
}
