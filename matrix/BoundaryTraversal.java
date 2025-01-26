package matrix;

public class BoundaryTraversal {

    public static void passingMatrix(int arr[][] , int r, int c){
         if(r==1){
            // single row matrix
            for(int i=0;i<c;i++){
                System.out.print(arr[0][i] + " ");

            }

         }else if(c==1){
            // single col matrix
            for(int i=0;i<r;i++){
                System.out.print(arr[i][0] + " ");

            }
         }else{

            // first row
            for(int i=0;i<c;i++){
                System.out.print(arr[0][i] + " ");

            }
               // last col
            for(int i=1;i<r;i++){
                System.out.print(arr[i][c-1] + " ");
            }

            // last row
            for(int i=c-2;i>=0;i--){
                System.out.print(arr[r-1][i] + " ");
            }

            // first col
            for(int i=r-2;i>=0;i--){
                System.out.print(arr[i][0] + " ");
            }

         }


        }
    
}
