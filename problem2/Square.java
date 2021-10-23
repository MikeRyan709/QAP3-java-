package problem2;

public class Square extends Shape {
    protected double side; 
    
    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String color, boolean filled){
        super(color, filled);
        
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setLength(double side){
        this.side = side;
    }
    public void setWidth(double side){
        this.side = side;
    }

    @Override
    public String toString() {
        return "a square with side = " + side + "which is a subclass of " + super.toString();
    }
    
}
