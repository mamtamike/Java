package learnings;

public class AddTwoDimArray {
    public static void main(String[] args) {
        // Define two 2D arrays (matrices)
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}};

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}};

        // Get number of rows and columns
        int rows = matrix1.length;
        int cols = matrix1[0].length;  //matrix[0] row starts from 0 index
        
        // Create a result matrix to store the sum
        int[][] sum = new int[rows][cols];

        // Add corresponding elements of matrix1 and matrix2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
          }
            System.out.println();

        }
    }
}
