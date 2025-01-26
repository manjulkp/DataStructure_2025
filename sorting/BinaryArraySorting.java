package sorting;

public class BinaryArraySorting {

    // Input: arr[] = [1, 0, 1, 1, 0]

    public static void binarySearch(int arr[] , int n){
        int left = 0;
        int right = n-1;

        while(left<=right){
            if(arr[left] == 0){
               left++;
            }else if(arr[right] == 1){
                right--;
            }else{
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
                
            }
        }
    }
    
}
