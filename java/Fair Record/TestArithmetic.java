
// Operation.java
package arithmetic;

public interface Operation {

    void calculate(double a, double b);
}



// Add.java
package arithmetic;

public class Add implements Operation {

    public void calculate(double a, double b) {

        System.out.println("Addition : " + (a + b));
    }
}



// Sub.java
package arithmetic;

public class Sub implements Operation {

    public void calculate(double a, double b) {

        System.out.println("Subtraction : " + (a - b));
    }
}



// Mul.java
package arithmetic;

public class Mul implements Operation {

    public void calculate(double a, double b) {

        System.out.println("Multiplication : " + (a * b));
    }
}



// Div.java
package arithmetic;

public class Div implements Operation {

    public void calculate(double a, double b) {

        if (b != 0) {

            System.out.println("Division : " + (a / b));

        } else {

            System.out.println("Cannot divide by zero");
        }
    }
}



// TestArithmetic.java
import arithmetic.*;

public class TestArithmetic {

    public static void main(String[] args) {

        double a = 10, b = 5;

        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        add.calculate(a, b);
        sub.calculate(a, b);
        mul.calculate(a, b);
        div.calculate(a, b);
    }
}

