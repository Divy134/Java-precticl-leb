package Part_3.Part_3_pr1;
abstract class GeometricObject {
    String color;
    boolean filled;
    java.util.Date datecreated;

    protected GeometricObject() {
        this.color = "blue";
    }

    protected GeometricObject(String color, boolean filled) {
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

    public java.util.Date getDatecreated() {
        return datecreated;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    abstract double getArea();

    abstract double getPerameter();
}
