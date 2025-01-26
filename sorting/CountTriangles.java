package sorting;

import java.util.Arrays;

public class CountTriangles {

        // Function to count the number of valid triangles
    static int countTriangle(int[] arr) {
        int res = 0; 

        // Sort the array to apply the triangle inequality efficiently
        Arrays.sort(arr);

        // Iterate through pairs of sides (arr[i], arr[j])
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // Find the first index where the sum of two sides is not valid
                int lo = j + 1, hi = arr.length;
                int target = arr[i] + arr[j];
                while (lo < hi) {
                    int mid = lo + (hi - lo) / 2;
                    if (arr[mid] < target) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                // Count the number of valid third sides
                int cnt = lo - j - 1;
                res += cnt;
            }
        }
        return res;
    }

}
