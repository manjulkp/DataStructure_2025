package search;

public class last_occurance {

    public static int last_occurance(int arr[] , int start , int end, int x){

        int mid = start +(end-start)/2;
        int n = arr.length;

        while(start<=end){

            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            }else{

                if((mid == n-1 && arr[mid] == x) || (arr[mid] == x && arr[mid+1] != arr[mid])){
                    return mid;
                }else{
                    start = mid+1;
                }
            }

        }
        return -1;
    }   
    
}
