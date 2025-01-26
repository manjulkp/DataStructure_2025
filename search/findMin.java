package search;

public class findMin {

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3,4};

        int index = findMinIndex(arr, 0, arr.length-1);

        System.out.println(index);

    }

    public static int findMinIndex(int arr[] , int start , int end ){

        if(arr[start] < arr[end]){
            return start;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                return mid+1;
            }

            if(arr[mid-1] > arr[mid]){
                return mid;
            }

            if(arr[0] > arr[mid]){
                end = mid-1;
            }else{
                start = mid +1;
            }


        }



        return -1;

    }


    
}
