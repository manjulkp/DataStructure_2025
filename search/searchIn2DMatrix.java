package search;

public class searchIn2DMatrix {

    

        // Function to binary search for x in arr[]
        // row = arr.length;
        // col = arr[0].length;
        static boolean search(int[][] arr, int x ) {
            int row = arr.length;
            int col = arr[0].length;

            int i = 0;
            int j= col-1;  //start with last element in the first row
    
            while(i < row && j >=0){
                if(arr[i][j] == x){
                    return true;
                }else if(arr[i][j] > x){
                   // reduce the col  // [10,20,30,40] and x , in this case a[i][j] = 40 > 29 so we reduce the col and not row 
                   j--;
                }else{
                    // find in next row 
                    i++;
                }
            }
            return false;
        }
    
}
