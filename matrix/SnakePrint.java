package matrix;

public class SnakePrint {

    public static void passingMatrix(int arr[][] ){
        for(int i=0;i<arr.length;i++){

            if(i%2==0){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }else{

            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }


        }
     }
    
}
