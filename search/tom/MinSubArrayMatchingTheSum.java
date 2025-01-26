package search.tom;

public class MinSubArrayMatchingTheSum {

    /*
      // 209. Minimum Size Subarray Sum
      // https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=binary-search

     * Input: target = 7, nums = [2,3,1,2,4,3]
        Output: 2
        Explanation: The subarray [4,3] has the minimal length under the problem constraint.

        Example 2:

        Input: target = 4, nums = [1,4,4]
        Output: 1

     * 
     * 
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sumOfCurrentWindow = 0;
        int res = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++) {
            sumOfCurrentWindow =  sumOfCurrentWindow + nums[right];

            while (sumOfCurrentWindow >= target) {

                res = Math.min(res, right - left + 1);
                // remove the left pointer item 
                sumOfCurrentWindow = sumOfCurrentWindow - nums[left];
                // increment left point
                left = left+1;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
    
}
