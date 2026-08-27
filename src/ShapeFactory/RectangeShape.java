package ShapeFactory;

public class RectangeShape implements Shape {
    private double length;
    private double breadth;

    public RectangeShape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    @Override
    public void describe() {
        System.out.println("This is a rectangle with length " + length + " and breadth " + breadth);
    }

}
