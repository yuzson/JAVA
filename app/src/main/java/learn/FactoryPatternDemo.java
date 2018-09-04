package learn;

public class FactoryPatternDemo {
    public static void main(String[] args){
        System.out.println("Hello Word");
        ShapeFactory shapeFactory =new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
