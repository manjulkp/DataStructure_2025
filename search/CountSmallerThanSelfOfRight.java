package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSmallerThanSelfOfRight {

        
        private static int binarySearch(List<Integer> sortedList, int target) {
            int left = 0, right = sortedList.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sortedList.get(mid) >= target) {
                    right = mid - 1; // Move left if target is smaller or equal
                } else {
                    left = mid + 1; // Move right if target is larger
                }
            }
            return left; // Insertion index
        }
    
        // Main function to count smaller numbers
        public static List<Integer> countSmaller(int[] nums) {
            List<Integer> result = new ArrayList<>();
            List<Integer> sortedList = new ArrayList<>();
    
            // Iterate from the end of nums to the beginning
            for (int i = nums.length - 1; i >= 0; i--) {
                // Find the index to insert the current number
                int index = binarySearch(sortedList, nums[i]);
                result.add(index);
                // Insert the number into the sorted list
                sortedList.add(index, nums[i]);
            }
    
            // Since we traversed from end to start, reverse the result
            Collections.reverse(result);
            return result;
        }

        public static void main(String[] args) {
            int nums[] = {5, 2, 6, 1};
            List<Integer> result = countSmaller(nums);
            System.out.println(result); // Output: [2, 1, 1, 0]
        }
    
    
    
}
