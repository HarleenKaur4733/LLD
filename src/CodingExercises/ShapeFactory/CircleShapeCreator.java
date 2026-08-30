package CodingExercises.ShapeFactory;

public class CircleShapeCreator extends ShapeCreator {

    int radius;

    public CircleShapeCreator(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape createShape() {
        return new CircleShape(radius);
    }

}
