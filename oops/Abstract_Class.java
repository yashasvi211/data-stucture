public class Abstract_Class {
    public static void main(String args[]) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle();
        Square square = new Square();

        // Calling abstract method and concrete method
        circle.draw();
        circle.display();

        square.draw();
        square.display();
    }
}

// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method with implementation
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {
    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass
class Square extends Shape {
    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a square");
    }
}
