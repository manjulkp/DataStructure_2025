package matrix;

public class PrintMatrix {
    public static void main(String[] args) {
        int m=3;
        int n; // can be defined by the user
        int arr[][] = new int[m][];
    }

    // jagged array means only row is defined , column can used by user 
    public static void printJaggedArray(int arr[][]){

        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1]; // create new array important step

            for(int j=0;j<arr[j].length;j++){
                arr[i][j] = i;
                System.out.print(arr[j] + "  ");
            }
            System.out.println();
        }

    }

    /*
     * 2D array is called jagged array if all the rows are of not same sizes 
     */

     public static void passingMatrix(int arr[][] ){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }
     }
    
}
