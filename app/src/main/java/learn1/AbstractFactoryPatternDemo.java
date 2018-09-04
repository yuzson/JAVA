package learn1;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取形状为CIRCLE对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //调用draw方法
        shape1.draw();
        //获取RECTANGLE对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();
        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
