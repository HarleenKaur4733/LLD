package CodingExercises.ShapeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        ShapeCreator circleCreator = new CircleShapeCreator(5);
        circleCreator.describeShape();

        ShapeCreator rectangleCreator = new RectangleShapeCreator(10, 5);
        rectangleCreator.describeShape();
    }
}
