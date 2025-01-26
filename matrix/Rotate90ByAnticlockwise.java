package matrix;

public class Rotate90ByAnticlockwise {
    
    public static void rotateNaive(int arr[][], int r, int c){
        // rows becomes col 
        /*
         * 
         *     
    mat[0][0] goes to mat[3][0]
    mat[0][1] goes to mat[2][0]
    mat[1][0] goes to mat[3][1]
    mat[3][3] goes to mat[0][3]
         */

        int temp[][] = new int[r][c];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                // [0,1] needs to go to   [2,0]
                // [0,2] needs to go to   [1,0]
                /*
                 * in result matrx , the row becomes col 
                 * row = r-j-1
                 * col = i
                 */

                temp[r-j-1][i] = arr[i][j];
                // int row = r-j-1;

                // System.out.print("row " + row + "col " + i  );
                // System.out.println();

                // System.out.print(temp[r-j-1][i]);

            }
            System.out.println();
        }

    }

    /*
     *  
     * 
Input: mat[][] = [[1,  2,  3,  4],
                [5,  6,  7,  8], 
                [9, 10, 11, 12],
                [13, 14, 15, 16]]

Output: [[4, 8, 12, 16], 
         [3, 7, 11, 15],
        [2, 6, 10, 14],
        [1, 5, 9, 13]]

     

     *  
     * 
     * 
     */

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotateNaive(arr, 4, 4);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }

    /*
     * efficient sol 
     * 1. transpose
     * 2. reverse the matrix
     */
    
     public static void transpose(int arr[][] ){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
            System.out.println();
        }
    }

    public static void reverse(int arr[][] ,int r , int c){
        for(int i=0;i<c;i++){  // iterate through col

            int left =0;    // row index for swapping 
            int right = r-1;
// reverse row
// 0,0 =====> 3,0
            while(left<=right){
                int temp = arr[left][i];
                arr[left][i] = arr[right][i];
                arr[right][i] = temp;
                left++;
                right--;

            }
            
        }
    }

}
