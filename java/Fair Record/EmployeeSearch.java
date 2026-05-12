import java.util.Scanner;

class Employee {

    int eNo;
    String eName;
    double eSalary;

    void readData(Scanner sc) {

        System.out.println("Enter Employee number:");
        eNo = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter employee name:");
        eName = sc.nextLine();

        System.out.println("Enter Employee salary:");
        eSalary = sc.nextDouble();
    }

    void display() {

        System.out.println("Employee no: " + eNo);
        System.out.println("Employee name: " + eName);
        System.out.println("Employee salary: " + eSalary);
    }
}

public class EmployeeSearch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Employees:");
        int n = sc.nextInt();

        Employee emp[] = new Employee[n];

        for (int i = 0; i < n; i++) {

            emp[i] = new Employee();

            System.out.println("Enter details of Employee " + (i + 1));
            emp[i].readData(sc);
        }

        System.out.println("Enter Employee number to search:");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (emp[i].eNo == searchNo) {

                System.out.println("Employee found:");
                emp[i].display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found");
        }
    }
}