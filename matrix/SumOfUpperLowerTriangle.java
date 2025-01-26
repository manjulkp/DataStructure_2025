package matrix;

public class SumOfUpperLowerTriangle {


    public static void passingMatrix(int arr[][] ){
        int lowerSum =0;
        int upperSum =0;


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i<=j){
                    upperSum = upperSum + arr[i][j];
                }
                else{  // j<=i
                    lowerSum = lowerSum + arr[i][j];
                }
            }
            System.out.println();
        }
     }
    
}
