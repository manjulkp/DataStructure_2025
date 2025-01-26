package search.tom;

public class FindMissingNumber {

    /*
     * 268. Missing Number
     * // smallest missing number

     * 
     * Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
     */

     public static int missingNumber(int arr[] ,int n){

          int i =0;
          while (i<n ){

               if(arr[i] > 0 && arr[i] < n && arr[i] != arr[ arr[i]-1]){
                    int temp = arr[i];
                    arr[i] = arr[ arr[i]-1];
                    arr[ arr[i]-1] = temp;

               }else{
                    i++;
               }

          }

          for(i=0;i<n;i++){
               if(arr[i] != i+1){
                   return (i+1);
               }

          }
          return n+1;

     }
    
}
