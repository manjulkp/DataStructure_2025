package search;

public class first_occurance {

    // This can also be asked as Left most occurance of a number
    
    public static int first_occurance_iterative(int arr[] , int start , int end, int x){

        int mid = start +(end-start)/2;

        while(start<=end){

            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            }else{

                if((mid ==0 && arr[mid] == x) || (arr[mid] == x && arr[mid-1] != arr[mid])){
                    return mid;
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }   
}
