import java.util.Scanner;

class Symmetric {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows:");
        int r = sc.nextInt();

        System.out.println("Enter no. of columns:");
        int c = sc.nextInt();

        int m[][] = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        boolean symmetric = true;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (m[i][j] != m[j][i]) {
                    symmetric = false;
                }
            }
        }

        if (symmetric) {
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }
}