interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujando un rectángulo.");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujando un cuadrado.");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Dibujando un círculo.");
    }
}

class ShapeFactory {
    // Utiliza una cadena para determinar qué clase crear
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}
