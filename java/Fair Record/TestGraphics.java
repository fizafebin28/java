
// Shape.java
package graphics;

public interface Shape {
    double area();
}



// Rectangle.java
package graphics;

public class Rectangle implements Shape {

    double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}



// Triangle.java
package graphics;

public class Triangle implements Shape {

    double b, h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double area() {
        return 0.5 * b * h;
    }
}



// Square.java
package graphics;

public class Square implements Shape {

    double a;

    public Square(double a) {
        this.a = a;
    }

    public double area() {
        return a * a;
    }
}



// Circle.java
package graphics;

public class Circle implements Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
}



// TestGraphics.java
import graphics.*;

public class TestGraphics {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(3, 6);
        Square s = new Square(4);
        Circle c = new Circle(2);

        System.out.println("Rectangle Area : " + r.area());
        System.out.println("Triangle Area : " + t.area());
        System.out.println("Square Area : " + s.area());
        System.out.println("Circle Area : " + c.area());
    }
}

