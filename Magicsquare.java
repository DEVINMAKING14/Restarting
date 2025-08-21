import java.util.*;

class MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Expected sum = sum of first row
        int expectedSum = 0;
        for (int j = 0; j < n; j++) {
            expectedSum += mat[0][j];
        }

        boolean isMagic = true;

        // Check all rows
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum != expectedSum) {
                isMagic = false;
                break;
            }
        }

        // Check all columns
        if (isMagic) {
            for (int j = 0; j < n; j++) {
                int colSum = 0;
                for (int i = 0; i < n; i++) {
                    colSum += mat[i][j];
                }
                if (colSum != expectedSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        // Check diagonals
        if (isMagic) {
            int d1 = 0, d2 = 0;
            for (int i = 0; i < n; i++) {
                d1 += mat[i][i];
                d2 += mat[i][n - 1 - i];
            }
            if (d1 != expectedSum || d2 != expectedSum) {
                isMagic = false;
            }
        }

        if (isMagic) {
            System.out.println("The matrix is a Magic Square!");
        } else {
            System.out.println("The matrix is NOT a Magic Square.");
        }
    }
}
