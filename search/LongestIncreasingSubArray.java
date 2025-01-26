package search;

public class LongestIncreasingSubArray {

    public static int LongestIncreaseSubArray(int arr[] , int n){

        int maxLength = 1;
        int currentLength = 1;

        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                currentLength++;
            }else{

                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;

            }
        }
        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }
    
}
