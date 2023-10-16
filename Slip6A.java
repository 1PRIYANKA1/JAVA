// Write a java program to display transpose of a given matrix. 

public class Slip6A {
    public static void main(String args[]) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int b[][] = new int[3][3];
        System.out.println("Given matrix :: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after transpose :: ");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                b[i][j] = a[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
