package sorting;

import java.util.Arrays;

public class MinDifferenceInArray {

    public static int minDiffNaive(int arr[] , int n){
        int res = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){

            int j = i-1;

            while(j>=0){
                int diff = arr[i] - arr[j];
                res= Math.min(res, diff);
                j--;
            }
        }
        return res;
    }

    /*
     * sort 
     * then diff betn consecutive
     * return result
     */

     public static int efficient(int arr[] , int n){
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            res = Math.min(res , arr[i]-arr[i-1]);
        }
        return res;
        
     }
    
}
