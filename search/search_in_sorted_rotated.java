package search;

public class search_in_sorted_rotated {

    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
        int index = search(arr, 0, arr.length-1, 3);
        System.out.println( arr[index] );
    }

    public static int search(int arr[] , int start , int end , int x){
        int n = arr.length-1;
        
        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] == x)
                return mid ;

            // first half is sorted 
            if (arr[0] < arr[mid]){

                if(arr[0] <= x && x< arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

             
            }else{
                 // second half is sorted 
                if(arr[mid] < x && x<= arr[n-1]){
                    start = mid+1;
                }else{
                   end = mid-1;
                }

            }


        
        }



        return -1;
    }
    
}
