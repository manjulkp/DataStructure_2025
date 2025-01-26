package search;

public class MaxWaterBetnTwoBuildings {

    // [1,2,3,4,1,3,2]

    // if conside building with 2 and building with 2  -> then distance between these 2 building * height of the building 

    // using 2 pointer method 

    public static int maxWater(int arr[] , int n){
        int left = 0 ;
        int right = n-1;

        int maxWater = 0;

        while(left < right){

            if(arr[left] < arr[right]){

                maxWater = Math.max(maxWater , (right-left+1) * arr[left]);
                left++;

            }else if (arr[left] > arr[right]){

                maxWater = Math.max(maxWater , (right-left+1) * arr[right]);
                right--;

            }else{

                maxWater = Math.max(maxWater , (right-left+1) * arr[right]);
                left++;
                right--;

            }

        }
        return maxWater;
    }
    
}
