package matrix;

public class SpiralTranverse {

    /*
    [Expected Approach] Using Boundary Traversal 
     * top row  ---------- right col
     * 
     * left col---------- bottom row
     * 
     * top row
     * bottom row
     * 
     * left column
     * right column
     * 
     * 
     * print top row , then top++
     * right col , right--
     * bottom row , bottom-- (reverse order)
     * left col , left++  (reverse order)
     */

    public static void passingMatrix(int arr[][] , int r , int c){
         int top_row =0;
         int bottom_row = r-1;

         int left_col =0;
         int right_col = c-1;

         while(top_row<=bottom_row && left_col<==right_col){

            /*
             * Print the top row from left to right and increment top.
               Print the right column from top to bottom and decrement right.
             */
            for(int j=left_col;j<=right_col;j++){
                System.out.print( arr[top_row][j]);
            }
            top_row++;

            for(int i=top_row;i<=bottom_row;i++){
                System.out.print( arr[i][right_col]);
            }
            right_col--;

// Check if boundaries have crossed; if not, print the bottom row from right to left and decrement bottom.
// Print the left column from bottom to top and increment left.

// Print bottom row from right to left (if exists)
if(top_row<=bottom_row){
    for(int j=right_col;j>=left_col;j--){
        System.out.print( arr[bottom_row][j]);
    }
    bottom_row--;
}

 // Print left column from bottom to top (if exists)
 if (left_col <= right_col) {

    for(int i=bottom_row;i>=top_row;i--){
        System.out.print( arr[i][left_col]);
    }
    left_col++;
}
         }

        }
     }

    
}
