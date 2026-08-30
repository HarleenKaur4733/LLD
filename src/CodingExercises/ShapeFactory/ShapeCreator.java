package CodingExercises.ShapeFactory;

public abstract class ShapeCreator {
    // abstract because we want to force subclasses to implement this method
    public abstract Shape createShape();

    // common method
    public void describeShape() {
        Shape shape = createShape();
        shape.describe();
        shape.area();
    }
}
