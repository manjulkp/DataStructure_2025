package matrix;

public class MultiplyMatrix {


    public static void addMatrix(int arr[][], int b[][] , int row1 , int col1, int row2 , int col2){

        if(col1 != row2){
            return ;
        }
        int k = col1;

        int temp[][] = new int[row1][col2];

        for(int i=0;i<row1;i++){

            for(int j=0;j<col2;j++){

                
                for(int l =0;l<k;l++){

                    temp[i][j] = temp[i][j] + arr[i][l] +b[l][j];
                }

               

            }
            System.out.println();
        }
     }
    
}
