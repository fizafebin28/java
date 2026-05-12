import java.util.Scanner;

interface Shape {

    void area();

    void perimeter();
}

class Circle implements Shape {

    double r;

    Circle(double r) {

        this.r = r;
    }

    public void area() {

        System.out.println("Area of circle : " + (Math.PI * r * r));
    }

    public void perimeter() {

        System.out.println("Perimeter of circle : " + (2 * Math.PI * r));
    }
}

class Rectangle implements Shape {

    double l, b;

    Rectangle(double l, double b) {

        this.l = l;
        this.b = b;
    }

    public void perimeter() {

        System.out.println("Perimeter of rectangle : " + (2 * (l + b)));
    }

    public void area() {

        System.out.println("Area of rectangle : " + (l * b));
    }
}

public class AreaPerimeter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ch;

        do {

            System.out.println("1. Circle\n2. Rectangle\n3. Exit");

            System.out.print("Enter choice : ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter radius : ");
                    double r = sc.nextDouble();

                    Circle c = new Circle(r);

                    c.area();
                    c.perimeter();

                    break;

                case 2:

                    System.out.print("Enter length & breadth : ");

                    double l = sc.nextDouble();
                    double b = sc.nextDouble();

                    Rectangle rect = new Rectangle(l, b);

                    rect.area();
                    rect.perimeter();

                    break;

                case 3:

                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } while (ch != 3);
    }
}