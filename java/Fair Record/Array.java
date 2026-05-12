import java.util.Scanner;

public class Array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter no. to search:");
        int key = sc.nextInt();

        int found = 0, index = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == key) {

                found = 1;
                index = i;
                break;
            }
        }

        if (found == 1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Not found!");
        }
    }
}