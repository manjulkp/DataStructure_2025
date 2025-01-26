package matrix;

public class ExchangeRows {


    public static void exchange(int arr[][]  , int row, int col  ){
        for(int i=0;i<col;i++){
            
            int top_row = 0;
            int bottom_row = col-1;

            while(top_row<=bottom_row){
                int temp = arr[top_row][i];
                arr[top_row][i] = arr[bottom_row][i];
                arr[bottom_row][i] = temp;
                top_row++;
                bottom_row--;
            }

        }
     }
    
}
