public class Shape {
   private String color = "green";
   private boolean filled = true;

    public Shape(){

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

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A shape with color of " + getColor() + " and " + ( this.filled ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape.toString());
        Shape shape1 = new Shape();
        System.out.println(shape1);
        Shape shape2 = new Shape("yellow", true);
        System.out.println(shape2.toString());
    }
}
