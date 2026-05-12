import java.util.Scanner;

class Person {

    String name;
    String gender;
    String address;
    int age;

    Person(String name, String gender, String address, int age) {

        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {

    int empid;
    String cName;
    String qualification;
    double salary;

    Employee(String name, String gender, String address,
             int age, int empid, String cName,
             String qualification, double salary) {

        super(name, gender, address, age);

        this.empid = empid;
        this.cName = cName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {

    String subject;
    String department;
    int teacherid;

    Teacher(String name, String gender, String address,
            int age, int empid, String cName,
            String qualification, double salary,
            String subject, String department,
            int teacherid) {

        super(name, gender, address, age,
              empid, cName, qualification, salary);

        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    void display() {

        System.out.println("Teacher id: " + teacherid);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Employee id: " + empid);
        System.out.println("Company name: " + cName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }
}

public class MultilevelInherit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Teachers:");
        int n = sc.nextInt();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter details of Teacher: " + (i + 1));

            System.out.println("Name:");
            String name = sc.next();

            System.out.println("Gender:");
            String gender = sc.next();

            System.out.println("Address:");
            String address = sc.next();

            System.out.println("Age:");
            int age = sc.nextInt();

            System.out.println("Employee id:");
            int empid = sc.nextInt();

            System.out.println("Company name:");
            String cName = sc.next();

            System.out.println("Qualification:");
            String qualification = sc.next();

            System.out.println("Salary:");
            double salary = sc.nextDouble();

            System.out.println("Department:");
            String dept = sc.next();

            System.out.println("Teacher id:");
            int teacherid = sc.nextInt();

            System.out.println("Subject:");
            String subject = sc.next();

            t[i] = new Teacher(
                    name, gender, address, age,
                    empid, cName, qualification,
                    salary, subject, dept, teacherid
            );
        }

        System.out.println("\nTeacher details:");

        for (int i = 0; i < n; i++) {
            t[i].display();
        }
    }
}