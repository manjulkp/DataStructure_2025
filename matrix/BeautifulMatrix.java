package matrix;

public class BeautifulMatrix {

    // all the row and all columa are equal sum when u add 


/*
 * 1, 2    ==>
 * 3, 4    -->
 */

 public static int findMinOperation(int[][] mat) {
    // code here
    int row = mat.length;
    int col = mat[0].length;

    int r[] = new int [row]; int c[] = new int [col];
    int max=0;
    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            r[i] += mat[i][j];
            c[j] += mat[i][j];
        }
    }

        for(int i=0; i<row; i++){
            max = Math.max(max, r[i]);
        }
        for(int j=0; j<col; j++){
            max = Math.max(max, c[j]);
        }
    int res=0;

    for(int i=0; i<row; i++){
     res = res+ max-r[i];
    }
    return res;
}
 }
    

