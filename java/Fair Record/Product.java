import java.util.Scanner;

class Product {
    int pcode;
    String pname;
    double price;

    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println("Product code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Product 1:");
        int c1 = sc.nextInt();
        String n1 = sc.next();
        double pr1 = sc.nextDouble();

        Product p1 = new Product(c1, n1, pr1);

        System.out.println("Enter details of Product 2:");
        int c2 = sc.nextInt();
        String n2 = sc.next();
        double pr2 = sc.nextDouble();

        Product p2 = new Product(c2, n2, pr2);

        System.out.println("Enter the details of Product 3:");
        int c3 = sc.nextInt();
        String n3 = sc.next();
        double pr3 = sc.nextDouble();

        Product p3 = new Product(c3, n3, pr3);

        System.out.println("Entered the details of 3 Products");

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }

        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("Product with lowest Price:");
        lowest.display();
    }
}