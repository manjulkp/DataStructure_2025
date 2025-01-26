package search;

public class count_all_ones {
     // 0,0,1,1,1
    // find the first occurance   
    public static int first_occurance(int arr[] , int start , int end){

        int mid = start +(end-start)/2;
        int n = arr.length;

        while(start<=end){

            if (1 < arr[mid]) {
                end = mid - 1;
            } else if (1 > arr[mid]) {
                start = mid + 1;
            }else{

                if((mid == 1 && arr[mid] == 1) || (arr[mid] == 1 && arr[mid-1] != arr[mid])){
                    // find the first occurance of 1
                    return (n-mid);
                }else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    } 
}
