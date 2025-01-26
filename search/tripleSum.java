package search;
public class tripleSum {

    public static int[] findTripleSum(int arr[] , int n , int sum){
    
        for(int i=0;i<n;i++){
            
            int l = i + 1, r = n - 1;
      
            int requiredSum = sum - arr[i];
            while(l < r) {
                if(arr[l] + arr[r] == requiredSum)
                    return new int[]{arr[l] , arr[r] , arr[i]};
                if(arr[l] + arr[r] < requiredSum)
                    l++;
                else if(arr[l] + arr[r] > requiredSum)
                    r--;
            }

        }

        return new int[]{-1,-1,-1};


    }
    
}
