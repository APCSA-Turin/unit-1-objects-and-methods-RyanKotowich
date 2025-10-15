package U1T7.U1L8;
public class Letter {
    private String author;

    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String author) {
        this.author = author;
    }
    public void letterWriter(String name) {
         greeting(name);
         specialMessage();
         closing();

   }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + author);
    }
}

