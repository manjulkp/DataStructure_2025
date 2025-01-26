package search.tom;

public class findMinInDuplicateSorryArray {


    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;  
        int min=Integer.MAX_VALUE;

        while(low<=high){

            int mid = low+ (high-low)/2;

            if(nums[low]== nums[mid] && nums[mid]==nums[high]){
                min = Math.min(min,nums[low]);
                low++;
                high--;
                continue;
            }

            if(nums[low]<nums[high]) {
                min = Math.min(min,nums[low]);
                break; 
            }

            else if(nums[low]<=nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else if(nums[mid]<=nums[high]){
                
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
    
}
