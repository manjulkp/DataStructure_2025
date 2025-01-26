package search;

public class MaxConsecutiveStepsOneCanClimb {

    // https://www.geeksforgeeks.org/roof-top/

    // This is similar to Longest Consecutive subarray 

    public static int roofTop(int arr[], int n){
        int maxLength =0;
    int currentLength =0;
    
    for(int i=0;i<n-1;i++){

        if(arr[i] < arr[i+1]){
            currentLength++;
            maxLength = Math.max(maxLength, currentLength);

        }else{
            currentLength =0;
        }

    }

    return maxLength;

    }

    
}
