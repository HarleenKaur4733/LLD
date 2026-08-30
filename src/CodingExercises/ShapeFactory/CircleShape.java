package CodingExercises.ShapeFactory;

public class CircleShape implements Shape {

    int radius;

    public CircleShape(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    public void describe() {
        System.out.println("This is a Circle shape.");
    }

}
