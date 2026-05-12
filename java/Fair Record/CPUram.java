import java.util.Scanner;

class CPU {
    int price;
}

class Processor {
    int cores;
    String manufacturer;
}

class RAM {
    int memory;
    String manufacturer;
}

public class CPUram {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        CPU cpu = new CPU();

        System.out.print("Enter CPU price:");
        cpu.price = sc.nextInt();

        Processor p = new Processor();

        System.out.println("Enter no. of cores:");
        p.cores = sc.nextInt();

        System.out.println("Enter processor manufacturer:");
        p.manufacturer = sc.next();

        RAM r = new RAM();

        System.out.println("Enter RAM memory:");
        r.memory = sc.nextInt();

        System.out.println("Enter RAM manufacturer:");
        r.manufacturer = sc.next();

        System.out.println("CPU price: " + cpu.price);
        System.out.println("Processor cores: " + p.cores);
        System.out.println("Processor manufacturer: " + p.manufacturer);
        System.out.println("RAM memory: " + r.memory + "GB");
        System.out.println("RAM manufacturer: " + r.manufacturer);
    }
}