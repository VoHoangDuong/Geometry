import java.sql.Struct;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + getWidth() + " and " + " length = " + getLength() + ", " + " which is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        Rectangle rectangle2 = new Rectangle(6,4,"red",false);
        System.out.println(rectangle2.toString());
        double Area = rectangle2.getArea();
        System.out.println("Area = " +rectangle2.getArea());
        System.out.println("Perimeter = " + rectangle2.getPerimeter());
    }
}
