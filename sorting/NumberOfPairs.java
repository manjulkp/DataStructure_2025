package sorting;

import java.util.Arrays;

public class NumberOfPairs {

    public static int countPairsNaive(int[] X, int[] Y)
    {
        int ans = 0;
        // Iterate over all the possible pairs
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < Y.length; j++) {
                // If x ^ y > y ^ x, increment ans
                if (Math.pow(X[i], Y[j])
                    > Math.pow(Y[j], X[i])) {
                    ans++;
                }
            }
        }
        return ans;
    }

    /*
     * case1:
     * x==0
     * return 0
     * case2:
     * x==1
     * return count number of 0 in Y
     * case3:
     * from x= 2 onwards if y=0 or y=1 , then return count of 0 and 1 in Y
     * case4:
     * x=3 , count NoOfY[2]
     * case5:
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    

    // Function to return count of pairs with x as one
    // element of the pair. It mainly looks for all values
    // in Y[] where x ^ Y[i] > Y[i] ^ x
    static int count(int x, int Y[], int n, int NoOfY[])
    {
        // If x is 0, then there cannot be any value in Y
        // such that x^Y[i] > Y[i]^x
        if (x == 0)
            return 0;

        // If x is 1, then the number of pairs is equal to
        // number of zeroes in Y[]
        if (x == 1)
            return NoOfY[0];

        // Find number of elements in Y[] with values
        // greater than x getting upperbound of x with
        // binary search
        int idx = Arrays.binarySearch(Y, x);
        int ans;
        if (idx < 0) {
            idx = Math.abs(idx + 1);
            ans = Y.length - idx;
        }
        else {
            while (idx < n && Y[idx] == x) {
                idx++;
            }
            ans = Y.length - idx;
        }

        // If we have reached here, then x must be greater
        // than 1, increase number of pairs for y=0 and y=1

        // if Y=0 or Y=1 exit count them if x=2 or greater 
        ans += (NoOfY[0] + NoOfY[1]);

        // Decrease number of pairs for x=2 and (y=4 or y=3)
        if (x == 2)
            ans -= (NoOfY[3] + NoOfY[4]);

        // Increase number of pairs for x=3 and y=2
        if (x == 3)
            ans += NoOfY[2];

        return ans;
    }

    // Function to returns count of pairs (x, y) such that
    // x belongs to X[], y belongs to Y[] and x^y > y^x
    static long countPairs(int X[], int Y[], int m, int n)
    {
        // To store counts of 0, 1, 2, 3 and 4 in array Y
        int NoOfY[] = new int[5];
        for (int i = 0; i < n; i++)
            if (Y[i] < 5)
                NoOfY[Y[i]]++;

        // Sort Y[] so that we can do binary search in it
        Arrays.sort(Y);

        long total_pairs = 0; // Initialize result

        // Take every element of X and count pairs with it
        for (int i = 0; i < m; i++)
            total_pairs += count(X[i], Y, n, NoOfY);

        return total_pairs;
    }

    public static int binarySearch(int[] arr, int length , int value){
        
        int left =0;
        int right = length-1;
        int ans = length;
        
        while(left<=right){
            
            int mid = (left+right)/2;
            
            if(arr[mid]>value){
                
                ans = mid;
                
                right = mid-1;
            }
            else {
                
                left = mid+1;
            }
        }
        
        return ans;
    }

}
