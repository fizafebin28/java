import java.util.Scanner;

class Area {

    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(float radius) {
        return 3.14 * radius * radius;
    }

    double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class MethodOverload {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Area obj = new Area();

        System.out.print("Enter side of square:");
        double side = sc.nextDouble();

        System.out.println("Area of square: " + obj.area(side));

        System.out.println("Enter breadth and length of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        System.out.println("Area of Rectangle: " + obj.area(length, breadth));

        System.out.println("Enter radius of circle:");
        float radius = sc.nextFloat();

        System.out.println("Area of circle: " + obj.area(radius));

        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.println("Area of triangle: " + obj.area(base, height, true));
    }
}