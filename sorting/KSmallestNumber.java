package sorting;

public class KSmallestNumber {

    public static int kSmallest(int arr[] , int k , int n){
        int start = 0;
        int end = n-1;


        while(start <=end){
            int pivot = findPivot(arr , start , end);

            if(pivot == k-1){
                 return arr[pivot];
            }else if (pivot < k-1){
                end = pivot-1;
            }else{
                start = pivot+1;
            }
            


        }
        return -1;
                
            }


        
            private static int findPivot(int[] arr, int start, int end) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'findPivot'");
            }
    
}
