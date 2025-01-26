package matrix;

public class TransposeMatrix {

    public static void transpose(int arr[][]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
                // swap the diagnal items 
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;


            }
            System.out.println();
        }
     }



    }
    

