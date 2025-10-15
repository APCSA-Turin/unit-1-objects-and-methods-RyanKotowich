package U1T7;

public class Point {
    private int x;
    private int y;

    // Constructor with two parameters
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor with one parameter
    public Point(int value) {
        this.x = value;
        this.y = value;
    }

    // No-argument constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int newX) {
        this.x = newX;
    }

    // Setter for y
    public void setY(int newY) {
        this.y = newY;
    }

    // Method to return coordinates as a string
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    // Method to return the quadrant
    public String quadrant() {
        if (x > 0 && y > 0) {
            return "Quadrant 1";
        } else if (x < 0 && y > 0) {
            return "Quadrant 2";
        } else if (x < 0 && y < 0) {
            return "Quadrant 3";
        } else if (x > 0 && y < 0) {
            return "Quadrant 4";
        } else if (x == 0 && y != 0) {
            return "On the Y axis";
        } else if (y == 0 && x != 0) {
            return "On the X axis";
        } else {
            return "At the origin";
        }
    }
}
