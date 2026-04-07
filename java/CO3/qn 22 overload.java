import java.util.Scanner;

class Area {


    double area(double r) {
        return Math.PI * r * r;
    }

    
    double area(double l, double w) {
        return l * w;
    }

    
    double area(float b, float h) {
        return 0.5 * b * h;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        
System.out.println("Choose one of them:");
        System.out.println("1.Circle  2.Rectangle  3.Triangle");
        int ch = sc.nextInt();

        if (ch == 1) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            System.out.println("Area = " + a.area(r));
        } 
        else if (ch == 2) {
            System.out.print("Enter length and width: ");
            double l = sc.nextDouble();
            double w = sc.nextDouble();
            System.out.println("Area = " + a.area(l, w));
        } 
        else if (ch == 3) {
            System.out.print("Enter base and height: ");
            float b = sc.nextFloat();
            float h = sc.nextFloat();
            System.out.println("Area = " + a.area(b, h));
        } 
        else {
            System.out.println("Invalid choice");
        }

    }  
    
}
