package sorting;

public class ChocolateDistributionMinDifference {


    public static int minDiff(int arr[] , int n, int m){
        int res = Integer.MAX_VALUE;

        for(int i =0;i+m-1<n;i++){
            int diff = arr[i+m-1] - arr[i];
            res = Math.min(diff, res);

        }
        return res;
    }

    
}
