package CodingExercises.ShapeFactory;

public class TriangleShape implements Shape {

    int base;
    int height;

    public TriangleShape(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void describe() {
        System.out.println("This is a Triangle");
    }

}
