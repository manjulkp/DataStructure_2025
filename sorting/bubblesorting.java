package sorting;

public class bubblesorting {
    /*
     * There can n-1 iteration in outer loop 
     * 
     * inside loop - we the below things 
     * compare every 2 items and move the greatest element to the last 
     * 
     * so the inside lopp runs for n-1-i times 
     * 
     */

     public static void bubbleSorting(int arr[] , int n){

        for(int i=0;i<n-1;i++){
            boolean swap = false;

            for(int j=0;j<n-1-i; j++){

                if(arr[j] > arr[j++]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  swap = true;
                }
            }

            if(swap == false){
                break; // meaning since there is no swap , all the element are sorted 
            }

        
            }
        }

        /*iteration 1
         * 2, 10 ,8,7,1
         * 2,10 ,8,7,1
         * 2,8,10,7,1
         * 2,8,7,10,1
         * 2,8,7,1,10 
         * 
         * iteration 2 (n-1-i)
         * 2,8,7,1,10 
         * 2,7,8,1,10
         * 2,7,1,8,10
         * 2,7,1,8,10
         * 
         * 
         * 
         * 
         * 
         * 
         */

     }
    

