package Part_3.Part_3_pr1;

class Circle extends GeometricObject {
    double radius;

    Circle() {
        this.radius = 10;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 *  getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getPerameter() {
        return 2 * Math.PI * getRadius();
    }

}