// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Java_Assignment;

class Square extends GeometricObject {
    private double radius;
    public Square() {
    }
    public Square(double radius) {
        this.radius = radius;
    }
    public Square(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override 
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getDiameter() {
        return 2 * radius;
    }
    @Override 
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    @Override 
    public String toString() {
        return super.toString() + "\nDate created: " + getDateCreated() +
                "\nRadius: " + radius;
    }
}

class ComparableSquare extends Square implements Comparable<ComparableSquare> {

    public ComparableSquare() {
    }
    public ComparableSquare(double radius) {
        super(radius);
    }
    public ComparableSquare(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override 
    public int compareTo(ComparableSquare o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override 
    public String toString() {
        return super.toString() + "\nArea: " + getArea();
    }
}

abstract class GeometricObject {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

public class Pr_10 {
    public static void main(String[] args) {
        ComparableSquare s1 = new ComparableSquare(10.5);
        ComparableSquare s2 = new ComparableSquare(20.5);
        System.out.println("\nComparableSquare1:");
        System.out.println(s1);
        System.out.println("\nComparableSquare2:");
        System.out.println(s2);
        System.out.println(
                (s1.compareTo(s2) == 1 ? "\nComparableSquare1 " : "\nComparableSquare2 ")
                        + "is the larger of the two Squares");
    }
}

