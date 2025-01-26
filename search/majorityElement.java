package search;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    public static int majorityEle(int arr[] , int n){

        Map<Integer, Integer> countMap = new HashMap<>();

        // Traverse the array and count occurrences using the hash map
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
          
            // Check if current element count exceeds n / 2
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        // If no majority element is found, return -1
        return -1;

    }
    
}
