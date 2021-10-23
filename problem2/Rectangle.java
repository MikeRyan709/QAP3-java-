package problem2;

public class Rectangle extends Shape { //inheritance from the Shape class
    protected double width;
    protected double length;
    
    //constructors
    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) { // using super to pull elements from the parent class
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    //getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea() {
        return (length * width);
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    //setters
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "A rectangle with width = " + width + "and length = " + length + ", which is a subclass of " + super.toString();
    }

}