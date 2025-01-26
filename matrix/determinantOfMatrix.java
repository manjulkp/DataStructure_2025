package matrix;

public class determinantOfMatrix {

    // https://www.youtube.com/watch?v=RZvQkv9wZE0


    public static int findDeterminant(int mat[][] , int n){

        // Base case: if the matrix is 1x1
        if (n == 1) {
            return mat[0][0];
        }
        
        // Base case for 2x2 matrix
        // ad - bc
        // cross multiply
        if (n == 2) {
            return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
        }

        int ans = 0;
        int sign = 1;
        int temp[][] = new int[n][n];

        for(int row=0;row<n;row++){
            cofactor(mat , temp , 0, row, n);
                        ans = ans + sign*mat[0][row]*findDeterminant(temp, n-1);
                        sign = sign*-1;  
                    }
                    return ans;     
                }
            
                static void cofactor(int matrix[][], int temp[][], int R, int C, int n) {
                    int i = 0, j = 0;
                    for (int row = 0; row < n; row++) {
                        for (int col = 0; col < n; col++) {

                            if (row != R && col != C) {

                                temp[i][j] = matrix[row][col];
                                j++;

                                // reset the col 
                                if (j == n - 1) {
                                    j = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }

    
}
