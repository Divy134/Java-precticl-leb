// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Java_Assignment;

class RegularPolygon {
    private int n = 3;
    private double side = 1.00;
    private double x = 0;
    private double y = 0;

    RegularPolygon() {
        System.out.println("The Regular polygon Is : ");
        System.out.println("The Polygon centered at (" + x + "," + y + ")");
        System.out.println("The default Perimeter of Polygon is : " + getPerimeter());
        System.out.println("The default Area of Polygon is : " + getArea());
        System.out.println();
        System.out.println("For Find New one : ");
        System.out.println();
    }
    int getNos() {
        System.out.println("The Number Of side is : " + n);
        return n;
    }
    void setNos(int n) {
        this.n = n;
    }
    void getlos() {
        System.out.println("The Length Of side is : " + side);
    }

    void setlos(Double side) {
        this.side = side;
    }

    public void getx() {
        System.out.println("The value of x is : " + x);
    }
    public void setx(Double x) {
        this.x = x;
    }
    public void gety() {
        System.out.println("The value of y is : " + y);
    }
    public void sety(Double y) {
        this.y = y;
    }
    double getPerimeter() {
        double perimeter = n * side;
        return perimeter;
    }
    double getArea() {
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double area = ((side * side * n) / (4 * angle));
        return area;
    }
}

public class Pr_2 extends RegularPolygon {
    public static void main(String[] args) {
        RegularPolygon r = new RegularPolygon();
        r.setNos(2);
        r.getNos();
        r.setlos(15.00);
        r.getlos();
        r.setx(8.00);
        r.getx();
        r.sety(7.00);
        r.gety();
        System.out.println("The Perimeter of given Input is : " + r.getPerimeter());
        System.out.println("The Area of given Input is : " + r.getArea());
    }
}

