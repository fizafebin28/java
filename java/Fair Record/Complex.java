import java.util.Scanner;

class Complex {

    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {

        int r = this.real + c.real;
        int i = this.imag + c.imag;

        return new Complex(r, i);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number (real and imaginary):");

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.println("Enter second complex number:");

        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.println("Sum:");
        result.display();
    }
}