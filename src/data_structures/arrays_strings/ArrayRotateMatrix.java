package data_structures.arrays_strings;


/**
 * Created by Giorgi Megreli on 4/16/2016.
 */
public class ArrayRotateMatrix {

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

    /**
     * @param matrix
     * @param n - dimension on the matrix
     */
    public static void rotate90(int[][] matrix, int n) {
        for (int i = 0; i < n / 2; ++i) {
            int offset = n - 1 - i;
            for (int j = i; j < offset; ++j) {
                int diff = j - i;
                int cur = matrix[i][j];
                matrix[i][j] = matrix[offset - diff][i];
                matrix[offset - diff][i] = matrix[offset][offset - diff];
                matrix[offset][offset - diff] = matrix[j][offset];
                matrix[j][offset] = cur;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int n = 4;
        mockArray(matrix, n);

        printArray(matrix, n);
        rotate90(matrix, n);
        printArray(matrix, n);
    }
}
