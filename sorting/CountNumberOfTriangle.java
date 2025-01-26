package sorting;

import java.util.Arrays;

public class CountNumberOfTriangle {

    /*
     * a+b < c will form a triangle
     * Use 2 pointer method
     */

     public static int countValidTriangles(int arr[] , int n){
        int res = 0;
        Arrays.sort(arr);
         /*
          *  a+b = c  => means a=leftpointer , b= right pointer , c = arr[i]
          * left + right > i
          */

         // Iterate through the array, fixing the largest side at arr[i]
         for (int i = 2; i < arr.length; ++i) {
            // Initialize pointers for the two smaller sides
            int left = 0, right = i - 1;

            while (left < right) {
                if (arr[left] + arr[right] > arr[i]) {
                    // arr[left] + arr[right] satisfies the triangle inequality,
                    // so all pairs (x, right) with (left <= x < right) are valid
                    res += right - left;

                    // Move the right pointer to check smaller pairs
                    right--;
                } else {
                    // Move the left pointer to increase the sum
                    left++;
                }
            }
        }
        return res;

        
     }
    
}
