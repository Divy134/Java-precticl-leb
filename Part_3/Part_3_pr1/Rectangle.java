package Part_3.Part_3_pr1;

class Rectangle extends GeometricObject {
    double width;
    double height;

    Rectangle() {
        this.width = 10;
        this.height = 20;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerameter() {
        return 2 * (getHeight() + getWidth());
    }
}
