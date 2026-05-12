import java.util.*;

class SortString {

    String arr[];

    void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of strings:");
        int n = sc.nextInt();

        sc.nextLine();

        arr = new String[n];

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
    }

    void sort() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {

                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void display() {

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {

        SortString s = new SortString();

        s.input();
        s.sort();

        System.out.println("Sorted Strings:");
        s.display();
    }
}