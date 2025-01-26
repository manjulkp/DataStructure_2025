package matrix;

public class SearchInRow {

    public static boolean serachInMatrixRow(int arr[][] , int r, int c , int x){

        /*
         * start fromm top right cornern item 
         * if x is found 
         * if x is smaller , move left
         * if x is greater , move bottom
         */

        int top_row = 0;   // row start
        int right_col = c-1; 

        while(top_row<r && right_col>0){

            if(arr[top_row][right_col] == x){
                return true;
            }else if(arr[top_row][right_col] > x){
                right_col--; // move left side of the col  
            }else if(arr[top_row][right_col] < x){
                top_row++; // move down the row 
            }

        }
                return false;

    }
    
}
