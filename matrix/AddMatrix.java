package matrix;

public class AddMatrix {

    public static void addMatrix(int arr[][], int b[][] , int r , int c){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                System.out.print(arr[i][j]+b[i][j]);

            }
            System.out.println();
        }
     }

    }
    

