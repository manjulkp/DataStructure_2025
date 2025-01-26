package search;

public class findPeak {

    public static int findPeakIterative(int arr[] , int start , int end, int x){

        int mid = start +(end-start)/2;
        int n = arr.length;

        while(start<=end){

            if ( (mid ==0 || arr[mid] > arr[mid-1] ) && (arr[mid] > arr[mid+1] || mid == n-1) ) {
                return mid ;
            } else if (arr[mid] < arr[mid-1]) {
                end = mid -1;

            }else{
                start = mid +1;
            }
        }
        return -1;
    } 
    
}
