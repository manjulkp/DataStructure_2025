package matrix;

public class BooleanMatrix {


    static void booleanMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                  
                    // Replace all the zeros in jth column by -1
                    for (int idx = 0; idx < rows; idx++) {
                        if (mat[idx][j] == 0) {
                            mat[idx][j] = -1;
                        }
                    }

                    // Replace all the zeros in ith row by -1
                    for (int idx = 0; idx < cols; idx++) {
                        if (mat[i][idx] == 0) {
                            mat[i][idx] = -1;
                        }
                    }
                }
            }
        }

        // Replace all the -1 by 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    static void booleanMatrix(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        // Arrays to keep track of rows and columns to be marked
        boolean[] rowMarker = new boolean[rows];
        boolean[] colMarker = new boolean[cols];

        // First pass: Mark the rows and columns to be updated
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowMarker[i] = true;
                    colMarker[j] = true;
                }
            }
        }

        // Second pass: Update the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMarker[i] || colMarker[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }



    
}
