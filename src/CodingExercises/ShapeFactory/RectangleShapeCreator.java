package CodingExercises.ShapeFactory;

public class RectangleShapeCreator extends ShapeCreator {

    int length;
    int breadth;

    public RectangleShapeCreator(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Shape createShape() {
        return new RectangeShape(length, breadth);
    }

}
