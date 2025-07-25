package FactoryMethodPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "square": return new Square();
            case "rectangle": return new Rectangle();
            default: return null;
        }
    }
}
