package data_structures.arrays_strings;

/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class ArrayRowAndColumnZero {
    public static void mockArray(int[][] matrix, int n) {
        for (int i=0, cnt=0; i<n; i++)
            for (int j=0; j<n; j++)
                matrix[i][j] = ++cnt;
    }

    public static void printArray(int[][] matrix, int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++)
                System.out.format("%5d", matrix[i][j]);
            System.out.println();
        }
    }

    public static void zerofy(int[][] matrix, int n) {
        boolean[] row = new boolean[n];
        boolean[] column = new boolean[n];

        for (int i = 0; i < n; i++) {
            row[i] = column[i] = false;
        }

        for (int i = 0; i <n ; i++)
            for (int j = 0; j <n ; j++)
                if (matrix[i][j] == 0)
                    row[i] = column[j] = true;

        for (int i = 0; i < n ; i++)
            for (int j = 0; j < n ; j++)
                if (row[i] || column[j])
                    matrix[i][j] = 0;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        mockArray(matrix, n);
        matrix[1][3] = 0;
        matrix[1][2] = 0;
        printArray(matrix, n);
        zerofy(matrix, n);
        printArray(matrix, n);
    }
}
