package problem2;

public class Shape{
    protected String color; // colour of the shape
	protected boolean filled; // Is the shape filled true or false

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() { // using isFilled in place of get as per best practices
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return " a shape with a color of " + color + ", and " + filled;
    }
}

