package matrix;

public class ExchangeMatrixColumn {

    public static void exchange(int arr[][]  , int col ){
        for(int i=0;i<arr.length;i++){
            
            int left_col = 0;
            int right_col = col-1;

            while(left_col<=right_col){
                int temp = arr[i][left_col];
                arr[i][left_col] = arr[i][right_col];
                arr[i][right_col] = temp;
                left_col++;
                right_col--;
            }
        }
     }

    
}
